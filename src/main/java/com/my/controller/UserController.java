package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.my.pojo.Admin;
import com.my.pojo.Person;
import com.my.service.AdminService;

/**
 * Created by wanwan on 16/7/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private AdminService adminService;

@RequestMapping("/get")
    public ModelAndView GetUser(){

        ModelAndView mv = new ModelAndView();

        Person p = new Person("ddd","sdsd",22);
        mv.addObject("p",p);
        mv.setViewName("/detail");

           return mv;

    }

    @RequestMapping("/find")
    public ModelAndView find() throws Exception {

        ModelAndView mv = new ModelAndView();

    Admin admin =adminService.getAdmin(1);

        mv.addObject("admin",admin);
        mv.setViewName("/detail");
        return mv;
    }

}
