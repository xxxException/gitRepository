package com.pointer.springbootdemo.mybatis.service;

import com.pointer.springbootdemo.mybatis.domin.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    public User selectByUsername(String userName);

    public int addUser(User user);

    public boolean isHaveUserByUserName(String userName);

    public String getSaltByUserName(String userName);

}
