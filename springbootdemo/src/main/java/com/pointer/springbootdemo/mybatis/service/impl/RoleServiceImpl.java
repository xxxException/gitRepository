package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.Permission;
import com.pointer.springbootdemo.mybatis.domin.Role;
import com.pointer.springbootdemo.mybatis.mapper.RoleMapper;
import com.pointer.springbootdemo.mybatis.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<String> getRoleSnByUserId(Integer userId) {
        List<Role> roleList = roleMapper.getRoleByUserId(userId);
        List<String> snList= new ArrayList<>();
        if (roleList.isEmpty()) {
            return snList;
        }
        for (Role role: roleList) {
            snList.add(role.getSn());
        }
        return snList;
    }
}
