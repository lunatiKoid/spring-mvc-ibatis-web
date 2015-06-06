package com.leeon.biz.db.module.service;

import com.leeon.biz.db.module.dataobject.UserDO;

import java.util.List;

/**
 * Created by liang on 4/27/15.
 */
public interface UserService {
    List<UserDO> listUsersByName(String name) ;
    UserDO findUserByName(String name);
    UserDO findUserById(Integer id);
    int insertUser(UserDO userDO);
    int findMaxId();
}
