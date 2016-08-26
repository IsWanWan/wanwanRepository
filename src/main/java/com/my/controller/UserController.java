package com.my.controller;

import com.my.dao.UserMapper;
import com.my.pojo.Admin;
import com.my.pojo.Frutis;
import com.my.pojo.Person;
import com.my.pojo.User;
import com.my.service.AdminService;
import com.my.service.FrutisService;
import com.my.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
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
private UserService userService;

    @ResponseBody
    @RequestMapping("/index")
    public ModelAndView find() throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user");

        return mv;
    }

    @ResponseBody
    @RequestMapping("/listPage")
    public Map<String,Object> listPage(@RequestParam(required = false) String username, Integer page, Integer rows) throws Exception {
       System.out.println("pageNumber :" +page +"pageSize "+rows);

        Map map = new HashMap();
        Map<String ,Object> model = new HashMap<>();

        if(!StringUtils.isEmpty(username)){
            map.put("username",username);
        }
        List<User> userList = userService.listPage(map);
        model.put("total",userList.size());
        model.put("rows", userList);

        return model;
    }

}
