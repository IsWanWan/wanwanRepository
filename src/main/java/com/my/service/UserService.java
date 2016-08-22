package com.my.service;

import com.my.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanwan on 16/7/20.
 */
@Service
public interface UserService {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);

    List<User> listPage();
}
