package com.zzf.controller;

import com.zzf.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TicketHandleController {

    @Autowired
    TicketService ticketService;

    //电影票座位处理
    @RequestMapping("/ticketHandle")
    @ResponseBody
    public void ticketHandle(@RequestParam("zuowei") ArrayList<Integer> zuowei){

        String seat;

        //将座位号处理成几排几号
        for (Integer seatNumber:zuowei) {
            if (seatNumber>0 && seatNumber<=9){
                seat="第1排"+seatNumber+"号";
                ticketService.seatSave(seat,seatNumber);
            }
            if(seatNumber>9 && seatNumber%9!=0){
                Integer pai=seatNumber/9+1;
                Integer hao=seatNumber%9;
                seat="第"+pai+"排"+hao+"号";
                ticketService.seatSave(seat,seatNumber);
            }
            if (seatNumber>9 && seatNumber%9==0){
                Integer pai=seatNumber/9;
                Integer hao=9;
                seat="第"+pai+"排"+hao+"号";
                ticketService.seatSave(seat,seatNumber);
            }

        }

    }
}
