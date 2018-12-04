package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RoleMapper {
    List<Role> getRoleByUserId(Integer userId);
}
