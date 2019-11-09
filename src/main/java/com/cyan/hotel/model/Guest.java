package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.LoyatyLevel;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity
@Table(name = "guest")
//@PrimaryKeyJoinColumn(name = "userId")
public class Guest extends User {

    @Transient
    private String passwordConfirm;

    @Column(name = "emailAddress", nullable = false)
    private String emailAddress;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "loyaltyLevel")
    private LoyatyLevel loyatyLevel;

    @OneToMany(mappedBy = "guest")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "guest")
    private List<Payment> payments;

    public Guest() {
        super();
    }

    public Guest(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LoyatyLevel getLoyatyLevel() {
        return loyatyLevel;
    }

    public void setLoyatyLevel(LoyatyLevel loyatyLevel) {
        this.loyatyLevel = loyatyLevel;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
