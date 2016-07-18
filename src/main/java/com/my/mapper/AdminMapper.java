package com.my.mapper;

import org.springframework.stereotype.Repository;
import com.my.pojo.Admin;

/**
 * Created by wanwan on 16/7/17.
 */
@Repository
public interface AdminMapper {

    public Admin find(int id) throws Exception;
}
