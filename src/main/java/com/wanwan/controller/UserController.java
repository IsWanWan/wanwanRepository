package com.wanwan.controller;

import com.wanwan.domain.User;
import com.wanwan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by wanwan on 16/8/26.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/index")
    public ModelAndView index(){
          User user = userService.selectByPrimaryKey(1);
        System.out.println("user:" + user.getUsername());
        return new ModelAndView("/user");
    }
}
