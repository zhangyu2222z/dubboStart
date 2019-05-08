package com.zy.api.entity;

import java.io.Serializable;

/**
 * @author zhangy
 * @version Revision 2.0.0
 * @email: zhangy2222z@sina.cn
 * @create 2019-04-24 16:56
 **/

public class User implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
