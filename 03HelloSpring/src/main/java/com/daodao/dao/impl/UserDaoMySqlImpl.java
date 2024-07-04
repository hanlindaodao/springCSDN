package com.daodao.dao.impl;

import com.daodao.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("UserDaoMySqlImpl getUser method");
    }
}
