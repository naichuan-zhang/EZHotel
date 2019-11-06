package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 05-Nov-2019
 **/

//@MappedSuperclass
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
