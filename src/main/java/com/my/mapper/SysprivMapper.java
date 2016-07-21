package com.my.mapper;

import com.my.pojo.Syspriv;

public interface SysprivMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Syspriv record);

    int insertSelective(Syspriv record);

    Syspriv selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Syspriv record);

    int updateByPrimaryKey(Syspriv record);
}