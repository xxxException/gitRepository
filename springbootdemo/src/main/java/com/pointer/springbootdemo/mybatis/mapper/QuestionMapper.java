package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Question;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionMapper {

    Integer addQuestion(Question question);

    Question selectQuestionById(Question question);

    List<Question> listQuestion();

    void increaseCommentCount(Integer id);

}
