package com.pointer.springbootdemo.web.controller;

import com.pointer.springbootdemo.mybatis.domin.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;

@Controller
public class EntranceController {



    @RequestMapping("homepage")
    public String homepage(Model model) {
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User) subject.getPrincipal();
        System.out.println("userName = "+currentUser.getUserName());

        System.out.println("进入homepage");
        RedirectView redirectView = new RedirectView("/",true);
        Date date = new Date();
        model.addAttribute("dateTime",date);
        return "homepage";
    }

    //301redirect!!!!!!!!!!!!
    @RequestMapping("hello")
    public RedirectView hello(Model model) {

        RedirectView redirectView = new RedirectView("home.html");
        redirectView.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
        return redirectView;
    }

    @RequestMapping("register/{a}")
    public void register(String a,HttpServletSession servletSession) {
        System.out.println(a);
    }
}
