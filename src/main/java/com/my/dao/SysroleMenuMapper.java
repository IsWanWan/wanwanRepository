package com.my.dao;

import com.my.pojo.SysroleMenu;

public interface SysroleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysroleMenu record);

    int insertSelective(SysroleMenu record);

    SysroleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysroleMenu record);

    int updateByPrimaryKeyWithBLOBs(SysroleMenu record);

    int updateByPrimaryKey(SysroleMenu record);
}