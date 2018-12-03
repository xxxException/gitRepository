package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.Permission;
import com.pointer.springbootdemo.mybatis.mapper.PermissionMapper;
import com.pointer.springbootdemo.mybatis.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService{
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public void save(Permission permission) {
        permissionMapper.save(permission);
    }

    @Override
    public List<String> getResourceByUserId(Integer userId) {
        List<Permission> permissionList = permissionMapper.gerPermissonByUserId(userId);
        List<String> resourceList = new ArrayList<>();
        if (resourceList.isEmpty()) {
            return resourceList;
        }
        for (Permission permission : permissionList) {
            resourceList.add(permission.getResource());
        }
        return resourceList;
    }

    @Override
    public List<String> listAll() {
        List<Permission> permissionList = permissionMapper.listAll();
        List<String> resourceList = new ArrayList<>();
        if (permissionList.isEmpty()) {
            return resourceList;
        }
        for (Permission permission : permissionList) {
            resourceList.add(permission.getResource());
        }
        return resourceList;
    }
}
