package com.my.controller;

import com.my.pojo.Admin;
import com.my.pojo.Frutis;
import com.my.pojo.User;
import com.my.service.FrutisService;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.my.pojo.Person;
import com.my.service.AdminService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanwan on 16/7/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private FrutisService frutisService;
    @Autowired
    private UserService userService;

      @RequestMapping("/get")
    public ModelAndView GetUser(){

        ModelAndView mv = new ModelAndView();

        Person p = new Person("ddd","sdsd",22);
        mv.addObject("p",p);
        mv.setViewName("/detail");

           return mv;

    }
     @ResponseBody
    @RequestMapping("/find")
    public Map<String,Object> find() throws Exception {

        Map<String,Object> map = new HashMap<>();



        Admin admin =adminService.getByUsername("zhaoxiuling");

        map.put("admin",admin);

        return map;
    }


    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        User user = userService.selectByUsername("haha");

        mv.addObject("user",user);
        mv.setViewName("/detail");
        return mv;
    }

    @RequestMapping("/getOne")
    public ModelAndView getOne() throws Exception {

        ModelAndView mv = new ModelAndView();

        Frutis frutis =frutisService.selectByPrimaryKey("a2");

        mv.addObject("frutis",frutis);
        mv.setViewName("/detail");
        return mv;
    }



}
