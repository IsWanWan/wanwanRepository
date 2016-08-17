package com.my.dao;

import com.my.pojo.Sysmenu;

import java.util.List;

public interface SysmenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    Sysmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);


    List<Sysmenu> sysmenuList(int opertorId);

}