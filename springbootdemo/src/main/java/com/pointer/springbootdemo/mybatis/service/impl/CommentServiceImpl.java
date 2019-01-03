package com.pointer.springbootdemo.mybatis.service.impl;

import com.pointer.springbootdemo.mybatis.domin.Comment;
import com.pointer.springbootdemo.mybatis.mapper.CommentMapper;
import com.pointer.springbootdemo.mybatis.mapper.QuestionMapper;
import com.pointer.springbootdemo.mybatis.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    CommentMapper commentMapper;
    @Autowired
    QuestionMapper questionMapper;

    @Override
    public void addComment(Comment comment) {
        if (comment.getEntityType().equals("question")) {
            addCommentIntoQuestion(comment);
        }
    }

    public void addCommentIntoQuestion(Comment comment) {
        if (commentMapper.addComment(comment) > 0) {
            questionMapper.increaseCommentCount(comment.getEntityId());
        }
    }
}
