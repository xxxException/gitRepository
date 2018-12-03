package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.User;
import com.pointer.springbootdemo.mybatis.mapper.UserMapper;
import com.pointer.springbootdemo.mybatis.service.IUserService;
import com.pointer.springbootdemo.mybatis.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        String password = user.getUserPassword();
        user.setUserPassword(Md5Util.getHash(password));
        return 1;
    }


}
