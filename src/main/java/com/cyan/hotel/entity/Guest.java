package com.cyan.hotel.entity;

import com.cyan.hotel.enumeration.LoyatyLevel;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity(name = "Guest")
@Table(name = "guest")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    @Transient
    private String passwordConfirm;
    private String emailAddress;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private LoyatyLevel loyatyLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LoyatyLevel getLoyatyLevel() {
        return loyatyLevel;
    }

    public void setLoyatyLevel(LoyatyLevel loyatyLevel) {
        this.loyatyLevel = loyatyLevel;
    }
}
