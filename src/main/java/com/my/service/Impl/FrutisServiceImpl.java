package com.my.service.Impl;

import com.my.mapper.FrutisMapper;
import com.my.pojo.Frutis;
import com.my.service.FrutisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.transaction.AfterTransaction;

/**
 * Created by wanwan on 16/7/18.
 */

public class FrutisServiceImpl  implements FrutisService{
    @Autowired
    private FrutisMapper frutisMapper;
    @Override
    public int deleteByPrimaryKey(String fId) {
        return 0;
    }

    @Override
    public int insert(Frutis record) {
        return 0;
    }

    @Override
    public int insertSelective(Frutis record) {
        return 0;
    }

    @Override
    public Frutis selectByPrimaryKey(String fId) {
        return frutisMapper.selectByPrimaryKey(fId) ;
    }

    @Override
    public int updateByPrimaryKeySelective(Frutis record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Frutis record) {
        return 0;
    }
}