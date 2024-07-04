package com.daodao.useSet.service;

import com.daodao.useSet.dao.UserDaoImpl;
import com.daodao.useSet.dao.UserDaoMySqlImpl;
import org.junit.Test;

public class UserServiceImplTest {

    @Test
    public void getUserTest() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
    }

}
