package com.daodao.old.service;

import org.junit.Test;

public class UserServiceImplTest {

    @Test
    public void getUserTest() {
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }

}
