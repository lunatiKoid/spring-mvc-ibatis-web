package com.leeon.biz.db.module.dao.impl;

import com.leeon.biz.db.module.service.UserServicesLocator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by liang.yaol on 6/6/15.
 */
public class UserDaoImplTest {

    @Test
    public void testFindMaxId() throws Exception {
        assertEquals(112, UserServicesLocator.getUserService().findMaxId());
    }
}
