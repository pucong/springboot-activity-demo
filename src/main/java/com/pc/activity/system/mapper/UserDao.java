package com.pc.activity.system.mapper;

import com.pc.activity.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by PC on 2017/7/26.
 */
@Mapper
public interface UserDao {

    SysUser findByUserName(String name);
}
