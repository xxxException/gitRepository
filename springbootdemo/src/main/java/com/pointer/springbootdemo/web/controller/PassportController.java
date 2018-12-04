package com.pointer.springbootdemo.web.controller;

import com.pointer.springbootdemo.mybatis.service.impl.UserServiceImpl;
import com.pointer.springbootdemo.utils.RandomNumUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Controller
@RequestMapping("passport")
public class PassportController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("register")
    public String register(Model model) {
        RandomNumUtil randomNum = RandomNumUtil.instance();
        String identifyingCode = randomNum.getString();
        ByteArrayInputStream imgInputStream = randomNum.getImage();
        //返回可不发生阻塞地从此输入流读取的字节数。
        byte[] bytes = new byte[imgInputStream.available()];
        //从此输入流读取的字节数。
        try {
            imgInputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //将字节数组用base64编码
        String identifyingImg =base64Encoder.encode(bytes);

        model.addAttribute("identifyingCode",identifyingCode);
        model.addAttribute("identifyingImg",identifyingImg);

        return "passport/register";
    }


    //这个方法值处理登录失败之后的事情(换句话说，进入到这里，肯定是登录失败了)，如果登录成功的话，会跳转到shiro设置好的shiroFilterFactoryBean.setSuccessUrl("templates/homepage.ftl");
    @RequestMapping("validate")
    public String login(String userName, String password, Model model, HttpServletRequest request) {
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(userName);
        token.setPassword(password.toCharArray());
        //暫時沒有配置remeberMeManager
//        token.setRememberMe(true);
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

    @RequestMapping("register/{a}")
    public void register(String a) {
        System.out.println(a);
    }
}
