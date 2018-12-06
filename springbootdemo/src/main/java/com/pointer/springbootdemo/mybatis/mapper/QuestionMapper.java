package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionMapper {

    Integer addQuestion(Question question);

}
