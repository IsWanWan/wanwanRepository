package com.my.service.Impl;

import com.my.mapper.OperatorMapper;
import com.my.pojo.Operator;
import com.my.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanwan on 16/7/21.
 */
@Service
public class OperatorServiceImpl implements OperatorService {

    @Autowired
    private OperatorMapper operatorMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Operator record) {
        return 0;
    }

    @Override
    public int insertSelective(Operator record) {
        return 0;
    }

    @Override
    public Operator selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Operator record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Operator record) {
        return 0;
    }

    @Override
    public Operator selectByUsername(String username) {
        return operatorMapper.selectByUsername(username);
    }
}
