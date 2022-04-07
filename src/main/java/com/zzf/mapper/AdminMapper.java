package com.zzf.mapper;

import com.zzf.pojo.AdminUser;
import com.zzf.pojo.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface AdminMapper {

    //管理员登录
    @Select("select * from adminuser where username=#{username} and password=#{password}")
    AdminUser slectAdminUser(AdminUser adminUser);

    //员工查询
    @Select("select * from employees")
    Collection<Employees> selectAll();
}
