package com.zzf.controller;

import com.zzf.mapper.AdminMapper;
import com.zzf.pojo.AdminUser;
import com.zzf.pojo.Employees;
import com.zzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class AdminUserController {

    @Autowired
    AdminService adminService;
    //管理员登录页面
    @RequestMapping("/adminLogin")
    public String adminLogin(){
        return "adminlogin";
    }

    //跳转管理员首页
    @RequestMapping("/adminIndex")
    public String adminIndex(){
        return "adminIndex";
    }

    //登录处理
    @PostMapping("/loginHandle")
    public String loginHandle(AdminUser adminUser,Map<String,Object> map){
        AdminUser check= adminService.selctAdminUser(adminUser);

//        map.put("msg","账号密码错误");
        if (check!=null){

            return "redirect:/adminIndex";
        }else {
            map.put("msg","账号密码错误");
            return "adminLogin";
        }
    }


    @RequestMapping("/selectEmployees")
    public String selectEmployees(Model model){
        Collection<Employees> employeelist=adminService.selectEmployees();
        model.addAttribute(employeelist);
        return "admin/employeesHandle";
    }

}
