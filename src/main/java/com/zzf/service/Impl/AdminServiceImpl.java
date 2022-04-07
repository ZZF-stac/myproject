package com.zzf.service.Impl;

import com.zzf.mapper.AdminMapper;
import com.zzf.pojo.AdminUser;
import com.zzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public AdminUser selctAdminUser(AdminUser adminUser) {
        return adminMapper.slectAdminUser(adminUser);
    }
}
