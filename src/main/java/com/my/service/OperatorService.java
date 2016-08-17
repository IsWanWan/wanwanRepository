package com.my.service;

import com.my.pojo.Operator;
import org.springframework.stereotype.Service;

/**
 * Created by wanwan on 16/7/21.
 */
@Service
public interface OperatorService {

    int deleteByPrimaryKey(Long id);

    int insert(Operator record);

    int insertSelective(Operator record);

    Operator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Operator record);

    int updateByPrimaryKey(Operator record);

    Operator selectByUsername(String username);
}
