package com.zzf.service.Impl;

import com.zzf.mapper.TestMapper;
import com.zzf.pojo.Employees;
import com.zzf.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    TestMapper testMapper;

    @Override
    public Employees employeeSelect(Employees employees) {
        return testMapper.employeeSelect(employees);
    }
}
