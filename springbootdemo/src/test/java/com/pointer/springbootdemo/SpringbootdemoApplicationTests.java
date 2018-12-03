package com.pointer.springbootdemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.pointer.springbootdemo.mybatis.mapper.UserMapper;
import com.pointer.springbootdemo.mybatis.service.impl.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

//    @Autowired
//    DruidDataSource dataSource;
//
//    @Autowired
//    UserServiceImpl userService;
//    @Test
//    public void contextLoads() {
//
//    }
//
//    @Autowired
//    UserMapper userMapper;
//    @Test
//    public void hamappersh() {
//        System.out.println(userMapper.selectByUsername("root").getUserName());
//    }
//
//    @Test
//    public void test() {
//        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("D:\\文件\\实践项目\\springbootdemo\\src\\main\\resources\\shiro-realm.ini");
//        SecurityManager securityManager = factory.getInstance();
//
//        SecurityUtils.setSecurityManager(securityManager);
//        Subject subject = SecurityUtils.getSubject();
//        //从前台返回的登录信息
//        UsernamePasswordToken token = new UsernamePasswordToken("root","root");
//        //执行登录验证,途中调用MyRealm.doGetAuthenticationInfo()
//        //securityManager键token信息与myRealm中从数据库查出的数据信息做对比
//        subject.login(token);
//
//        System.out.println(subject.isAuthenticated());
//    }

}
