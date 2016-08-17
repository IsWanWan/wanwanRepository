package com.my.controller;

import com.my.pojo.Operator;
import com.my.pojo.Sysmenu;
import com.my.service.MenuService;
import com.my.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanwan on 16/7/21.
 */
@Controller
@RequestMapping("/operator")
public class OperatorController {


    @Autowired
    private OperatorService operatorService;

    @Autowired
    private MenuService menuService;

    @RequestMapping("/byUsername")
    public ModelAndView byUsername(String username){
        ModelAndView mv  = new ModelAndView();

      Operator operator =  operatorService.selectByUsername(username);
      //  mv.addObject("operator",operator);

        mv.setViewName("/first");


        return mv;

    }

    /**
     *
     * @return
     */
    @RequestMapping("/first")
    public ModelAndView first(){
        return new ModelAndView("/first");
    }

    /**
     *  获得菜单
     * @param opertorId
     * @return
     */
   @RequestMapping("/getMenu")
    public ModelAndView getMenu(int opertorId){

       List<Sysmenu> sysmenuList = new ArrayList<>();
       sysmenuList = menuService.sysmenuList(opertorId);


       return new ModelAndView("/first");
   }



}
