package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

/**
 * @author: Naichuan Zhang
 * @create: 05-Nov-2019
 *
 *
 **/

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", updatable = false, nullable = false)
    private Long userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guestId", referencedColumnName = "userId")
    private Guest guest;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "managerId", referencedColumnName = "userId")
    private Manager manager;


    @Column(name = "firstName", nullable = false)
    @Pattern(regexp = "^[a-zA-z]{1,100}", message = "Letters Only!")
    private String firstName;

    @Column(name = "lastName", nullable = false)
    @Pattern(regexp = "^[a-zA-z]{1,100}", message = "Letters Only!")
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public User() {

    }

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
