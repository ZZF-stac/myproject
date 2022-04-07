package com.zzf.controller;

import com.zzf.pojo.MovieTable;
import com.zzf.service.MovieService;
import com.zzf.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Map;

@Controller
public class MovieTableController {
    @Autowired
    MovieService movieService;
    @Autowired
    TicketService ticketService;

    //查询所有影片信息
    @GetMapping("/movieAll")
    public String movieAll(Model model){
        Collection<MovieTable> movies= movieService.selectMovieAll();
        model.addAttribute("movieAll",movies);

        return "tt";
    }

    //查询所有喜剧片
    @RequestMapping("/xiju")
    public String xiJuAll(Model model){

        Collection<MovieTable> movies=movieService.selectXijuAll();
        model.addAttribute("movieAll",movies);
        return "userIndex";
    }

    //查询所有动作片
    @RequestMapping("/dongzuoAll")
    public String dongzuoAll(Model model){
        Collection<MovieTable> movies=movieService.selectDongzuoAll();
        model.addAttribute("movieAll",movies);
        return "userIndex";
    }

    //查询所有剧情片
    @RequestMapping("/juqingAll")
    public String juqingAll(Model model){
        Collection<MovieTable> movies=movieService.selectJuqingAll();
        model.addAttribute("movieAll",movies);
        return "userIndex";
    }

    //搜索电影
    @RequestMapping("/movieSerch")
    public String movieSerch(@RequestParam("moviename") String moviename, Model model, Map<String,Object>map){

        Collection<MovieTable> movies=movieService.movieSerch(moviename);
        model.addAttribute("movieAll",movies);
        if(movies.size()!=0){
            return "userIndex";
        }else {
            map.put("msg","没有这部电影");
            return "userIndex";
        }

    }
    //个人中心
    @RequestMapping("/personController")
    public String personController(){

        return "personController";
    }

    //购票
    @RequestMapping("/shopTicket")
    public String shopTicket(){

        return "shopTicket";
    }


}
