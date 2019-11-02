package com.cyan.hotel.entity;

import org.springframework.boot.jta.atomikos.AtomikosDependsOnBeanFactoryPostProcessor;

import javax.persistence.Entity;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

public class Manager extends User {

    Manager(String username, String password) {
        super(username, password);
    }

    @Override
    public String getUsename() {
        return null;
    }

    public void manage() {
        // TODO: to be finished
    }
}
