package com.zzf.controller;

import com.zzf.pojo.MovieTable;
import com.zzf.pojo.User;
import com.zzf.service.MovieService;
import com.zzf.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
public class TestController {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    TestServiceImpl testService;
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/login")
    public String hello(){
        return "login";
    }

    //登录请求
    @PostMapping("/user/login")
    public String userLong(@RequestParam("username") String username,@RequestParam("password") String password,
                           Map<String,Object> map,Model model ){
        //        @RequestParam("username") String username,@RequestParam("password") String password

        map.put("msg","密码错误");

        User checkUser=testService.getUser(username, password);


        if (checkUser!=null){
            model.addAttribute("user",checkUser);
            return "redirect:/success";
        }else{
            return "login";
        }

    }

    @RequestMapping("/regist")
    public String regist(){
//        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
//            return "redirect:success";
//        }else {
//            return "login";
//        }
        return "add";
    }

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> query(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user ");
        return list.get(0);

    }

    @GetMapping("/query1")
    public User query1(@RequestParam("id") int id){

        return testService.getUserById(id);
    }

    @RequestMapping("/addUser")
    public void addUser(User user){

        testService.savUser(user);
        System.out.println(user);
    }

    //登录成功后跳转的页面
    @RequestMapping("/success")
    public String success(Model model){
//        Map<String,Object> map
//        map.put("hello","你好");
//        return "success";
        Collection<MovieTable> movies= movieService.selectMovieAll();
        model.addAttribute("movieAll",movies);
        return "userIndex";
    }

    //跳转到个人中心页面
    @GetMapping("/personController")
    public String personController(Model model){


        return "personController";
    }

    //首页
//    @RequestMapping("/indexUser")
//    public String indexUser(){
//
//        return "indexUser";
//    }

}
