package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Institute;
import com.pointer.springbootdemo.mybatis.domin.InstituteExample;
import com.pointer.springbootdemo.mybatis.domin.InstituteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstituteMapper {
    int countByExample(InstituteExample example);

    int deleteByExample(InstituteExample example);

    int deleteByPrimaryKey(InstituteKey key);

    int insert(Institute record);

    int insertSelective(Institute record);

    List<Institute> selectByExample(InstituteExample example);

    Institute selectByPrimaryKey(InstituteKey key);

    int updateByExampleSelective(@Param("record") Institute record, @Param("example") InstituteExample example);

    int updateByExample(@Param("record") Institute record, @Param("example") InstituteExample example);

    int updateByPrimaryKeySelective(Institute record);

    int updateByPrimaryKey(Institute record);
}