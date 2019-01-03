package com.pointer.springbootdemo.mybatis.mapper;

import com.pointer.springbootdemo.mybatis.domin.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {

    Integer addComment(Comment comment);

    Comment getComment();

    List<Comment> selectQuestionsByEntity(String entityType, Integer entityId);
}
