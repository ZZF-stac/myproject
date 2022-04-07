package com.zzf.service;

import com.zzf.mapper.TestMapper;
import com.zzf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {
    @Autowired
    TestMapper testMapper;

    public User getUserById(Integer id){
        return testMapper.selectall(id);
    }

    public void savUser(User user){
        testMapper.saveUser(user);
    }

    public User getUser(String username,String password){
        return testMapper.selectUser(username,password);
    }
}
