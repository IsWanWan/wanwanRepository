package com.my.service;

import com.my.pojo.Admin;
import org.springframework.stereotype.Service;

/**
 * Created by wanwan on 16/7/17.
 */
@Service
public interface AdminService {

  public Admin selectByPrimaryKey(int id) throws Exception;

   public Admin getByUsername(String username) throws Exception;

}
