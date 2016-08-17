package com.my.service.Impl;

import com.my.dao.SysmenuMapper;
import com.my.pojo.Sysmenu;
import com.my.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanwan on 16/7/21.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private SysmenuMapper sysmenuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Sysmenu record) {
        return 0;
    }

    @Override
    public int insertSelective(Sysmenu record) {
        return 0;
    }

    @Override
    public Sysmenu selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Sysmenu record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Sysmenu record) {
        return 0;
    }

    @Override
    public List<Sysmenu> sysmenuList(int opertorId) {
        return sysmenuMapper.sysmenuList(opertorId);
    }
}
