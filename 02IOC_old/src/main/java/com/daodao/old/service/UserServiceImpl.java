package com.daodao.old.service;

import com.daodao.old.dao.UserDao;
import com.daodao.old.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMySqlImpl();
    private UserDao userDao = new UserDaoOracleImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
