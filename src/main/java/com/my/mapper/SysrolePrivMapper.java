package com.my.mapper;

import com.my.pojo.SysrolePriv;

public interface SysrolePrivMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysrolePriv record);

    int insertSelective(SysrolePriv record);

    SysrolePriv selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysrolePriv record);

    int updateByPrimaryKeyWithBLOBs(SysrolePriv record);

    int updateByPrimaryKey(SysrolePriv record);
}