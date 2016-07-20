package com.my.service;

import com.my.pojo.Admin;

/**
 * Created by wanwan on 16/7/17.
 */
public interface AdminService {

  public Admin selectByPrimaryKey(int id) throws Exception;

   public Admin getByUsername(String username) throws Exception;

}
