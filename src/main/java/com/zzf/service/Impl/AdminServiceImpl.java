package com.zzf.service.Impl;

import com.zzf.mapper.AdminMapper;
import com.zzf.pojo.AdminUser;
import com.zzf.pojo.Employees;
import com.zzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public AdminUser selctAdminUser(AdminUser adminUser) {
        return adminMapper.slectAdminUser(adminUser);
    }

    //查询所有员工信息
    @Override
    public Collection<Employees> selectEmployees() {
        return adminMapper.selectAll();
    }

}
