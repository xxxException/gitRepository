package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Student;
import com.pointer.springbootdemo.mybatis.queryObject.StudentQUeryObject;

import java.util.List;

public interface StudentMapper {

    int deleteById(Integer id);

    List<Student> listAll();

    Student selectById();

    Student select(StudentQUeryObject studentQUeryObject);
}