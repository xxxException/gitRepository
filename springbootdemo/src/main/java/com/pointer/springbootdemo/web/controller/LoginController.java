package com.pointer.springbootdemo.web.controller;

import com.pointer.springbootdemo.mybatis.domin.User;
import com.pointer.springbootdemo.mybatis.service.impl.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
在controller中将username和password封装进UserNameAndPasswordToken中，然后从SecurityUtils中获取当前subject，然后subject。login（token）
 */

@Controller
public class LoginController {

    @Autowired
    UserServiceImpl userService;


    //这个方法值处理登录失败之后的事情(换句话说，进入到这里，肯定是登录失败了)，如果登录成功的话，会跳转到shiro设置好的shiroFilterFactoryBean.setSuccessUrl("templates/homepage.ftl");
    @RequestMapping("validate")
    public String login(String userName, String password, Model model, HttpServletRequest request) {
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(userName);
        token.setPassword(password.toCharArray());
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("errorMsg","没有错误");

        try {
            subject.login(token);
        } catch (UnknownAccountException ex) {
            ex.printStackTrace();
            model.addAttribute("errorMsg","账户不存在");
            System.out.println("账户不存在");
            return "forward:/login";
        } catch (IncorrectCredentialsException ex) {
            ex.printStackTrace();
            model.addAttribute("errorMsg","用户名或密码错误");
            return "forward:/login";
        } catch (Exception ex) {
            ex.printStackTrace();
            model.addAttribute("errorMsg","未知错误信息，请联络管理员");
            return "forward:/login";
        }
        System.out.println("Session:     "+request.getSession().getClass().getName());
        System.out.println("loginController");
        return "redirect:/homepage";
    }


    @RequestMapping("logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }
}
