package com.leeon.biz.db.module.dao;


import com.leeon.biz.db.module.dataobject.UserDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by liang on 4/27/15.
 */

public interface UserDao {

    List<UserDO> listUsersByName(String name);

    UserDO findUserByName(String name);

    UserDO findUserById(Integer id);

    Integer findMaxId();

    int insertUser(UserDO userDO);
}




