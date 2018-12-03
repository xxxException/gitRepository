package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Teacher;
import com.pointer.springbootdemo.mybatis.domin.TeacherExample;
import com.pointer.springbootdemo.mybatis.domin.TeacherKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(TeacherKey key);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(TeacherKey key);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}