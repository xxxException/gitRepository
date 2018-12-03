package com.pointer.springbootdemo.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class EntranceController {

    @RequestMapping("login")
    public String login(Model model) {
        return"login";
    }

    @RequestMapping("homepage")
    public String homepage(Model model) {
        System.out.println("进入homepage");
        RedirectView redirectView = new RedirectView("/",true);
        return "homepage";
    }

    //301redirect!!!!!!!!!!!!
    @RequestMapping("hello")
    public RedirectView hello(Model model) {

        RedirectView redirectView = new RedirectView("home.html");
        redirectView.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
        return redirectView;
    }
}
