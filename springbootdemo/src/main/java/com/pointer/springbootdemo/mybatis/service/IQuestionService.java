package com.pointer.springbootdemo.mybatis.service;

import com.pointer.springbootdemo.mybatis.domin.Question;

import java.util.List;

public interface IQuestionService {

    public Integer addQuestion(Question question);

    public List<Question>listQuestion();

    Question selectQuestion(Question question);

    public void increaseCommentCount(Integer id);
}
