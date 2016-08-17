package com.my.dao;

import com.my.pojo.Sysconfig;

public interface SysconfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sysconfig record);

    int insertSelective(Sysconfig record);

    Sysconfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysconfig record);

    int updateByPrimaryKeyWithBLOBs(Sysconfig record);

    int updateByPrimaryKey(Sysconfig record);
}