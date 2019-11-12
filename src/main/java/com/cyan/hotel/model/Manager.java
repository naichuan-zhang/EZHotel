package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity
@Table(name = "manager")
public class Manager extends User {

    @OneToOne(mappedBy = "manager")
    private User user;

    public Manager(String username, String password) {
        super();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
