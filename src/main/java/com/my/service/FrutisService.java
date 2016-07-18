package com.my.service;

import com.my.pojo.Frutis;
import org.springframework.stereotype.Service;

/**
 * Created by wanwan on 16/7/18.
 */

public interface FrutisService {
    int deleteByPrimaryKey(String fId);

    int insert(Frutis record);

    int insertSelective(Frutis record);

    Frutis selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(Frutis record);

    int updateByPrimaryKey(Frutis record);
}
