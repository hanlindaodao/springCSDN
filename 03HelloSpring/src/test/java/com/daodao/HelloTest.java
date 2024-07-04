package com.daodao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

    @Test
    public void test() {
        // 解析xml文件，生成管理相应的Bean对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // getBean : 参数即为spring配置文件中的id
        Hello hello = (Hello) context.getBean("hello1");
        hello.show();
    }
}