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
    public ModelAndView index(){
        return new ModelAndView("/test");
    }

    @ResponseBody
    @RequestMapping("/find")
    public Map<String, Object> find(String username) throws Exception {

        Map<String, Object> map = new HashMap<>();
        Admin admin = adminService.getByUsername(username);
        map.put("admin", admin);

        return map;
    }

    @ResponseBody
    @RequestMapping("/listPage")
    public ModelAndView listPage(@RequestParam(required = false) String username) throws Exception {
        Map map = new HashMap();
      ModelAndView mv = new ModelAndView();
        if(!StringUtils.isEmpty(username)){
            map.put("username",username);
        }
        List<User> userList = userService.listPage(map);
        mv.addObject("userlist", userList);
        mv.setViewName("/user");

        return mv;
    }

}
