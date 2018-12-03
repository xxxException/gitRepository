package com.pointer.springbootdemo.mybatis.service;

import com.pointer.springbootdemo.mybatis.domin.Role;

import java.util.List;

public interface IRoleService {
    List<String> getRoleSnByUserId(Integer userId);

}
