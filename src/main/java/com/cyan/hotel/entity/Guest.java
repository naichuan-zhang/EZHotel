package com.cyan.hotel.entity;

import com.cyan.hotel.enumeration.LoyatyLevel;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

public class Guest extends User {

    private int id;
    private String emailAddress;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private LoyatyLevel loyatyLevel;

    Guest(String username, String password, String emailAddress,
          String phoneNumber, String firstName, String lastName, LoyatyLevel loyatyLevel) {
        super(username, password);
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyatyLevel = loyatyLevel;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLoyatyLevel(LoyatyLevel loyatyLevel) {
        this.loyatyLevel = loyatyLevel;
    }

    public LoyatyLevel getLoyatyLevel() {
        return loyatyLevel;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getUsename() {
        return null;
    }
}
