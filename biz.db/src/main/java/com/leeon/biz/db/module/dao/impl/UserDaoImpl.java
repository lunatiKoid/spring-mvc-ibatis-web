package com.leeon.biz.db.module.dao.impl;

import com.leeon.biz.db.module.dao.UserDao;
import com.leeon.biz.db.module.dataobject.UserDO;
import com.leeon.biz.db.module.factory.ConnectionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by liang on 4/27/15.
 */
public class UserDaoImpl implements UserDao {

    private ConnectionFactory connectionFactory;
    private SqlSession        sqlSession;

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void init() {
        sqlSession = connectionFactory.getSqlSessionFactory().openSession();
    }

    public void destroy() {
        sqlSession.close();
    }

    @Override
    public Integer findMaxId() {
        return (Integer) sqlSession.selectOne("DB_USER.findMaxId");
    }

    @Override
    public UserDO findUserByName(String name) {
        return (UserDO) sqlSession.selectOne("DB_USER.findUserByName", name);
    }

    public UserDO findUserById(Integer id) {
        return (UserDO) sqlSession.selectOne("DB_USER.findUserByName", id);
    }

    public int insertUser(UserDO userDO) {
        int ret = (Integer) sqlSession.insert("DB_USER.insertUser", userDO);
        sqlSession.commit();
        return ret;
    }
}
