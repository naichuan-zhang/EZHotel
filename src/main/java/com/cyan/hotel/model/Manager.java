package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity
@Table(name = "manager")
//@PrimaryKeyJoinColumn(name = "userId")
public class Manager extends User {

    public Manager(String username, String password) {
        super();
    }
}
