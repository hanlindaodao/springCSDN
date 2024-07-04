package com.daodao.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user2");
        user.show();
    }
}
