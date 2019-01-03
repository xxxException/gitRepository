package com.pointer.springbootdemo.web.controller;

import com.pointer.springbootdemo.mybatis.domin.User;
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
import java.util.UUID;

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

    @RequestMapping("register/submit")
    public String registerSubmit(String userName, String password, String userIdentifyingCode, String identifyingCode, Model model) {
        //判断验证码是否正确，错误则返回注册页面，并报错误信息
        if (!userIdentifyingCode.equals(identifyingCode)) {
            model.addAttribute("identifyingCodeErrorMsg","验证码错误，请重试");
            return "forward:/passport/register";
        }
        //查看用户名是否重复
        if (userService.isHaveUserByUserName(userName)) {
            model.addAttribute("nameErrorMsg","用户名重复");
            return "forward:/passport/register";
        }

        //将信息封装进user中
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        userService.addUser(user);

        //直接登录
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(userName);
        token.setPassword(password.toCharArray());
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);

        return "redirect:/homepage";
    }

    @RequestMapping("login")
    public String login(Model model) {
        return"passport/login";
    }

    @RequestMapping("login/validate")
    public String loginValidate(String userName, String password, Model model, HttpServletRequest request) {
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
            model.addAttribute("errorMsg","账户不存在");
            System.err.println("账户不存在");
            return "forward:/passport/login";
        } catch (IncorrectCredentialsException ex) {
            model.addAttribute("errorMsg","用户名或密码错误");
            System.err.println("用户名或密码错误");
            return "forward:/passport/login";
        } catch (Exception ex) {
            model.addAttribute("errorMsg","未知错误信息，请联络管理员");
            System.err.println("未知错误信息，请联络管理员");
            return "forward:/passport/login";
        }
        return "redirect:/homepage";
    }


    @RequestMapping("logout")
    public String logout() {
        System.out.println("logout");
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/passport/login";
    }

    @RequestMapping("register/aaa")
    public void register() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}
