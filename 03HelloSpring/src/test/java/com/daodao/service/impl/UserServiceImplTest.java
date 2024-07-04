package com.daodao.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

    @Test
    public void test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("ServiceImpl");
        // 不使用下边这个是因为我在spring的配置文件里的id是上边的
//        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
