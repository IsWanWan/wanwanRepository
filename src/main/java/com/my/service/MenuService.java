package com.my.service;

import com.my.pojo.Sysmenu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanwan on 16/7/21.
 */
@Service
public interface MenuService {


    int deleteByPrimaryKey(Long id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    Sysmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);

    List<Sysmenu> sysmenuList(int opertorId);

}
