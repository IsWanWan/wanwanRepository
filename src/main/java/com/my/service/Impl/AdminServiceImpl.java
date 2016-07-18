package com.my.service.Impl;

import com.my.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.my.pojo.Admin;
import com.my.service.AdminService;

/**
 * Created by wanwan on 16/7/17.
 */
public class AdminServiceImpl  implements AdminService{

    @Autowired
    AdminMapper adminMapper;


    public Admin getAdmin(int id) throws Exception {
        Admin  admin =   adminMapper.find(1);


        return admin;
    }
}
