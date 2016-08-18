package com.my.controller;


import com.my.pojo.Person;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanwan on 16/7/16.
 */
public class PersonController  implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();
        List<Person> list = new ArrayList<Person>();
        Person p = new Person("sss", "DDd", 23);
        Person P1 = new Person("FF", "DFDS", 44);

        list.add(p);
        list.add(P1);
        mv.addObject("list", list);
        mv.setViewName("/detail");
        return mv;
    }
}
