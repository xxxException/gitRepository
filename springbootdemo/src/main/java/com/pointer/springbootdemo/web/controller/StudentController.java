package com.pointer.springbootdemo.web.controller;

import com.pointer.springbootdemo.shiro.PermissionName;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("list")
    @RequiresRoles("admin")
    @RequiresPermissions("student:query")
    @PermissionName("学生查询")
    public String list(Model model) {
        return"";
    }
}
