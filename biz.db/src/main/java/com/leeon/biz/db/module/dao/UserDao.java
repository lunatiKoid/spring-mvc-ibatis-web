package com.leeon.biz.db.module.dao;


import com.leeon.biz.db.module.dataobject.UserDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liang on 4/27/15.
 */

public interface UserDao {

    UserDO findUserByName(String name);

    UserDO findUserById(Integer id);

    Integer findMaxId();

    int insertUser(UserDO userDO);
}

//public interface UserDao {
//
//    @Select("SELECT * FROM user WHERE name=#{name}")
//    UserDO findUserByName(String name);
//
//    @Select("SELECT * FROM user WHERE id=#{id}")
//    UserDO findUserById(Integer id);
//
//    @Select("SELECT MAX(ID) FROM user")
//    Integer findMaxId();
//
//    @Insert("INSERT into user (id,name,age) values (#{id},#{name},#{age})")
//    int insertUser(UserDO userDO);
//}



