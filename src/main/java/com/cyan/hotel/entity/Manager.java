package com.cyan.hotel.entity;

import org.springframework.boot.jta.atomikos.AtomikosDependsOnBeanFactoryPostProcessor;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
