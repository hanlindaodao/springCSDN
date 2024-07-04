package com.daodao.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        user.show();
    }
}
