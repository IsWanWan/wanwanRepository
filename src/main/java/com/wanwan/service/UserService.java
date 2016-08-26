package com.wanwan.service;

import com.wanwan.domain.User;

/**
 * Created by wanwan on 16/8/26.
 */
public interface UserService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

}
