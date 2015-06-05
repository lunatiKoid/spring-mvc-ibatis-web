package com.leeon.biz.db.module.service.impl;


import com.leeon.biz.db.module.dao.UserDao;
import com.leeon.biz.db.module.dataobject.UserDO;
import com.leeon.biz.db.module.factory.ConnectionFactory;
import com.leeon.biz.db.module.service.UserService;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by liang on 4/27/15.
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
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

//public class UserServiceImpl implements UserService {
//
//    private ConnectionFactory connectionFactory;
//    private SqlSession        sqlSession;
//
//    private UserDao dao;
//
//    public void setConnectionFactory(ConnectionFactory connectionFactory) {
//        this.connectionFactory = connectionFactory;
//    }
//
//    public void init() {
//        sqlSession = connectionFactory.getSqlSessionFactory().openSession();
//        dao = sqlSession.getMapper(UserDao.class);
//    }
//
//    public void destroy() {
//        sqlSession.close();
//    }
//
//    public UserDO findUserByName(String name) {
//        return dao.findUserByName(name);
//    }
//
//    public UserDO findUserById(Integer id) {
//        return dao.findUserById(id);
//    }
//
//    public int findMaxId() {
//        return dao.findMaxId();
//    }
//
//    public int insertUser(UserDO userDO) {
//        int ret = dao.insertUser(userDO);
//        sqlSession.commit();
//        return ret;
//    }
//}
