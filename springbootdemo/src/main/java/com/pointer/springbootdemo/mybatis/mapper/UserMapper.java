package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {


    User selectByUsername(String userName);

    Integer countUserByUserName(String userName);

    Integer addUser(User user);

    String getSaltByUserName(String userName);

}