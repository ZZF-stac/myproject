package com.zzf.service.Impl;

import com.zzf.mapper.TestMapper;
import com.zzf.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TestMapper testMapper;

    //座位保存
    @Override
    public int seatSave(String seat,Integer seatnumber) {
        return testMapper.seatSave(seat,seatnumber);
    }
}
