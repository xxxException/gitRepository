package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.User;
import com.pointer.springbootdemo.mybatis.mapper.UserMapper;
import com.pointer.springbootdemo.mybatis.service.IUserService;
import com.pointer.springbootdemo.mybatis.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User selectByUsername(String userName) {
        return userMapper.selectByUsername(userName);
    }

    @Override
    public int addUser(User user) {
        //生成salt
        String salt = UUID.randomUUID().toString().substring(0,4);
        String password = user.getPassword();
        user.setPassword(Md5Util.getHash(password, salt));
        user.setSalt(salt);
        userMapper.addUser(user);
        return 1;
    }

    @Override
    public boolean isHaveUserByUserName(String userName) {
        Integer re = userMapper.countUserByUserName(userName);
        System.out.println(re);
        if (re==0) {
            return false;
        }
        return true;
    }

    @Override
    public String getSaltByUserName(String userName) {
        return userMapper.getSaltByUserName(userName);
    }


}
