package com.my.service.Impl;

import com.my.dao.AdminMapper;
import com.my.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import com.my.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * Created by wanwan on 16/7/17.
 */
@Service("adminService")
public class AdminServiceImpl  implements AdminService{

    @Autowired
  private  AdminMapper adminMapper;

    @Override
    public Admin selectByPrimaryKey(int id) throws Exception {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public Admin getByUsername(String username) throws Exception {
        return adminMapper.selectByUsername(username);
    }
}
