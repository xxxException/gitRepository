//package com.pointer.springbootdemo.web.filter;
//
//import com.pointer.springbootdemo.mybatis.domin.User;
//import com.sun.deploy.net.HttpResponse;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebFilter(filterName = "authorityFilter",urlPatterns = "/*")
//public class AuthorityFilter implements Filter{
//
//    List<String> excludeList;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        excludeList=new ArrayList<>();
//        excludeList.add("/user/login");
//        excludeList.add("/login");
//        excludeList.add("/index");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
//        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
//        boolean isExcluded = excludeList.contains(httpServletRequest.getRequestURI());
//        System.out.println("filter");
//        User user = (User) servletRequest.getAttribute("USER_IN_SESSION");
//        if (isExcluded == false & user == null) {
//            httpServletResponse.sendRedirect("/login");
//            return;
//        }
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//}
