package com.daodao.pojo;

public class User {

    private String name;

    public User(String name) {
        System.out.println("User 有参构造方式");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name:"+name);
    }
}
