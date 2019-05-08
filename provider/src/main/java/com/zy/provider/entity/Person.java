package com.zy.provider.entity;

import java.io.Serializable;

/**
 * @author zhangy
 * @version Revision 2.0.0
 * @email: zhangy2222z@sina.cn
 * @create 2019-05-08 10:24
 **/

public class Person implements Serializable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
