package com.pointer.springbootdemo.shiro;

import com.pointer.springbootdemo.mybatis.domin.User;
import com.pointer.springbootdemo.mybatis.mapper.RoleMapper;
import com.pointer.springbootdemo.mybatis.mapper.UserMapper;
import com.pointer.springbootdemo.mybatis.service.IUserService;
import com.pointer.springbootdemo.mybatis.service.impl.PermissionServiceImpl;
import com.pointer.springbootdemo.mybatis.service.impl.RoleServiceImpl;
import com.pointer.springbootdemo.mybatis.service.impl.UserServiceImpl;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * shiro将登录操作从controller转移到了shiro的filter中进行，
 * 通过重写的myRealm中的方法,用userName查询数据库中的用户信息（password和role），分别将其封装进AuthenticationInfo（登录认证）
 * 和AuthorizationInfo（授权）中去，securityManager比较从页面中用户输入的登录信息（token）和AuthenticationInfo，判断是否登陆成功，
 * 登录失败会就异常信息加载进request中
 *
 * 执行登录认证
 请求进来时，如果请求的路径为authc.loginUrl属性配置的路径（没配置，默认是/login.jsp）时，如果当前用户没有登录，authc这个拦截器会尝试获取请求中的账号跟密码值，然后比对ini配置文件或者realm中的用户列表，如果比对正确，直接执行登录操作，反之，抛异常，跳转到authc.loginUrl指定的路径。
 注意：请求中账号与密码必须固定为username 跟password， 如果需要改动必须额外指定，authc.usernameParam=xxx   authc.passwordParam=xxxx

 */

public class MyRealm extends AuthorizingRealm {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    RoleServiceImpl roleService;
    @Autowired
    PermissionServiceImpl permissionService;

    @Override
    public String getName() {
        return "MyRealm";
    }

    //授权,当访问与权限相关的请求是，才会加载
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //principalCollection 是 SimpleAuthenticationInfo返回的用户凭证
        User user = (User) principalCollection.getPrimaryPrincipal();
        System.out.println("getPrimaryPrincipal:    "+user);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //设置role和permission
        List<String> roles = new ArrayList<>();
        List<String> permissions = new ArrayList<>();
        roles = roleService.getRoleSnByUserId(user.getId());
        permissions = permissionService.getResourceByUserId(user.getId());
        info.addRoles(roles);
        info.addStringPermissions(permissions);

        return info;
    }

    //认证,开发者重写方法，该方法由api调用，返回我们从数据库中查询出的用户信息（如果有的话
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        String userName = (String)authenticationToken.getPrincipal();
        System.out.println("认证:   "+userName);
        User user = null;
        user = userService.selectByUsername(userName);
        if (user==null) {
            throw new UnknownAccountException();
        }
        //存进数据库的密码不能是明文，需要加密，这里我们用md5进行加密，散列次数为2，salt为"salt"
        String password = user.getPassword();
        //直接将user作为principal传入info中去，这样在授权操作中，就可以直接取出使用了
        AuthenticationInfo info = new SimpleAuthenticationInfo(user,password, ByteSource.Util.bytes(user.getSalt()),getName());
//        AuthenticationInfo info = new SimpleAuthenticationInfo(userName,password,getName());
        return info;
    }
}
