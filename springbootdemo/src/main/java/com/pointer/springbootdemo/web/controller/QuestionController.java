package com.pointer.springbootdemo.web.controller;

import com.pointer.springbootdemo.mybatis.domin.Question;
import com.pointer.springbootdemo.mybatis.domin.User;
import com.pointer.springbootdemo.mybatis.service.impl.QuestionServiceImpl;
import com.pointer.springbootdemo.utils.WebUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.Subject;
import java.util.Date;

@Controller
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionServiceImpl questionService;

    @RequestMapping("add")
    public String add(String title, String content) {
        User currentUser = (User) SecurityUtils.getSubject().getPrincipal();
        System.out.println(currentUser);
        Question question = new Question();
        question.setTitle(title);
        question.setContent(content);
        question.setUserId(currentUser.getId());
        question.setCommentCount(0);
        question.setCreateDate(new Date());

        if (questionService.addQuestion(question)>0) {
            return WebUtil.getJSONString(0);
        }
        return WebUtil.getJSONString(1,"失败");
    }

    @RequestMapping("list")
    public String list(Question question, Model model) {
        Question reQuestion = questionService.selectQuestion(question);
        model.addAttribute("question", reQuestion);
        System.out.println(reQuestion);
        return "question";
    }
}
