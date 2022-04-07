package com.zzf.controller;

import com.zzf.pojo.Employees;
import com.zzf.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EmployeesController {
    @Autowired
    EmployeesService employeesService;

    @RequestMapping("/employeeLoginIndex")
    public String employeeLoginIndex(){

        return "employeelogin";
    }

    @RequestMapping("/employeeIndex")
    public String employeeIndex(){
        return "employeeIndex";
    }

    @PostMapping("/employee/login")
    public String employeeLogin(Employees employees, Map<String,Object> map){

        Employees e= employeesService.employeeSelect(employees);
        if (e!=null){
            return "redirect:/employeeIndex";
        }else{
            map.put("msg","账号或密码错误");
            return "employeelogin";
        }

    }
}
