package com.leeon.biz.db.module.service.impl;

import com.leeon.biz.db.module.dao.UserDao;
import com.leeon.biz.db.module.dataobject.UserDO;
import com.leeon.biz.db.module.service.UserService;

import java.util.List;

/**
 * Created by liang on 4/27/15.
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<UserDO> listUsersByName(String name) {
        return userDao.listUsersByName(name);
    }

    public UserDO findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    public UserDO findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    public int findMaxId() {
        return userDao.findMaxId();
    }

    public int insertUser(UserDO userDO) {
        int ret = userDao.insertUser(userDO);
        return ret;
    }
}
