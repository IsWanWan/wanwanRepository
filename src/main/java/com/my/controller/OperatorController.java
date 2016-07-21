package com.my.controller;

import com.my.pojo.Operator;
import com.my.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by wanwan on 16/7/21.
 */
@Controller
@RequestMapping("/operator")
public class OperatorController {


    @Autowired
    private OperatorService operatorService;

    @RequestMapping("/byUsername")
    public ModelAndView byUsername(String username){
        ModelAndView mv  = new ModelAndView();

      Operator operator =  operatorService.selectByUsername(username);
      //  mv.addObject("operator",operator);

        mv.setViewName("/first");


        return mv;

    }
    @RequestMapping("/first")
    public ModelAndView first(){
        return new ModelAndView("/first");
    }





}
