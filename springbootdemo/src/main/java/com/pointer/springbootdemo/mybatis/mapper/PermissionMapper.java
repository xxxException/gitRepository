package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionMapper {

    void save(Permission permission);

    List<Permission> gerPermissonByUserId(Integer userId);

    List<Permission> listAll();
}
