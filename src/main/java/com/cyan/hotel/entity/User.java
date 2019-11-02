package com.cyan.hotel.entity;

import javax.persistence.Entity;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

public abstract class User {
    private Integer userId;
    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract String getUsename();
}
