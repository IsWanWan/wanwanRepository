package com.my.dao;

import com.my.pojo.OperatorRole;

public interface OperatorRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OperatorRole record);

    int insertSelective(OperatorRole record);

    OperatorRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OperatorRole record);

    int updateByPrimaryKeyWithBLOBs(OperatorRole record);

    int updateByPrimaryKey(OperatorRole record);
}