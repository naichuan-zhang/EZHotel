package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.LoyatyLevel;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import javax.persistence.*;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity
@Table(name = "guest")
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

    }

    public Guest(Builder<?> builder) {
        super(builder);
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder<?> builder() {
        return new Builder<Guest>() {
            @Override
            public Guest build() {
                return new Guest(this);
            }
        };
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

    public String getPhoneNumber() {
        return phoneNumber;
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

    public static abstract class Builder<T extends Guest> extends User.Builder<T> {

        private String emailAddress;
        private String phoneNumber;

        public Builder<T> emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder<T> phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
