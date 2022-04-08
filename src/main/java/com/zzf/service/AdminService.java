package com.zzf.service;

import com.zzf.pojo.AdminUser;
import com.zzf.pojo.Employees;

import java.util.Collection;

public interface AdminService {
    //管理员登录
    AdminUser selctAdminUser(AdminUser adminUser);

    //查询所有员工
    Collection<Employees> selectEmployees();
}
