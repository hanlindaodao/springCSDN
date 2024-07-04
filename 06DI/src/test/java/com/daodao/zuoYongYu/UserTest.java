package com.daodao.zuoYongYu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    /**
     * 单例模式
     * Singleton
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user01 = (User) applicationContext.getBean("user_singleton");
        User user02 = (User) applicationContext.getBean("user_singleton");
        System.out.println(user01 == user02);
    }

    /**
     * 原型模式
     * Prototype
     */
    @Test
    public void test02(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user01 = (User) applicationContext.getBean("user_prototype");
        User user02 = (User) applicationContext.getBean("user_prototype");
        System.out.println(user01 == user02);
    }
}