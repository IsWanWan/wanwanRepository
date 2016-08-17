package com.my.dao;

import com.my.pojo.Frutis;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutisMapper {
    int deleteByPrimaryKey(String fId);

    int insert(Frutis record);

    int insertSelective(Frutis record);

    Frutis selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(Frutis record);

    int updateByPrimaryKey(Frutis record);
}