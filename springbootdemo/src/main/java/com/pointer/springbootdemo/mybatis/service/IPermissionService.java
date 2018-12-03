package com.pointer.springbootdemo.mybatis.service;

import com.pointer.springbootdemo.mybatis.domin.Permission;

import java.util.List;

public interface IPermissionService {

    void save(Permission permission);

    List<String> getResourceByUserId(Integer userId);

    List<String> listAll();
}
