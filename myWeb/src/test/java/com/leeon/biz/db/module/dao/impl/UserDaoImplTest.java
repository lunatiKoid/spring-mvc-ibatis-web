package com.leeon.biz.db.module.dao.impl;

import com.leeon.biz.db.module.dataobject.UserDO;
import com.leeon.biz.db.module.service.UserServicesLocator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liang.yaol on 6/6/15.
 */
public class UserDaoImplTest {

    @Test
    public void testFindMaxId() throws Exception {
        assertEquals(1000, UserServicesLocator.getUserService().findMaxId());
    }

    @Test
    public void testInsert() throws Exception {
        UserDO userDO = new UserDO();
        userDO.setId(1000);
        userDO.setName("who");
        userDO.setAge(1000);
        assertNotNull(UserServicesLocator.getUserService().insertUser(userDO));
    }

    @Test
    public void testListUsersByName() throws Exception{
        List<UserDO> userDOList = UserServicesLocator.getUserService().listUsersByName("yao");
        for(UserDO userDO :userDOList){
            System.out.println(userDO.toString());
        }
        assertNotNull(userDOList);
    }
}
