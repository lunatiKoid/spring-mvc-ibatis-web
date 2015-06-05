package com.leeon.biz.db.module.service;

import com.leeon.biz.db.module.servicelocator.AbstractServiceLocator;

/**
 * Created by liang.yaol  on 4/30/15.
 */
public class UserServicesLocator extends AbstractServiceLocator {

    public static UserService getUserService() {
        return (UserService) getBeanFactory().getBean("userService");
    }
}
