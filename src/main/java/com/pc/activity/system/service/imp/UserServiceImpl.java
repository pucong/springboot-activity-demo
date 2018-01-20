package com.pc.activity.system.service.imp;

import com.pc.activity.system.entity.SysUser;
import com.pc.activity.system.mapper.UserDao;
import com.pc.activity.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by PC on 2017/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser findByUserName() {
        return userDao.findByUserName("admin");
    }
}
