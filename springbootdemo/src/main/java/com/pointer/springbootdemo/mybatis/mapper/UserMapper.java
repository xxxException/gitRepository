package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectByUsernameAndPassword(User user);

    User selectByUsername(String userName);

    List<String> list(String userName);

}