package com.pointer.springbootdemo.mybatis.util;

import com.pointer.springbootdemo.mybatis.domin.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class UserContext {

    public static HttpSession getSession() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return servletRequestAttributes.getRequest().getSession();
    }

    public static void setUser(User user) {
        getSession().setAttribute("USER_IN_SESSION",user);
    }

    public User getCurrentUser() {
        return (User) getSession().getAttribute("USER_IN_SESSION");
    }
}
