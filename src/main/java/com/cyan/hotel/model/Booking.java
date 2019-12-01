package com.cyan.hotel.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@Entity
@Table(name = "booking")
public class Booking  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private Long bookingId;

    @Column(name = "bookingDate")
//    @Pattern(regexp = "dd/MM/yyyy")
    private String bookingDate;

    @Column(name = "numberOfGuests")
    private Integer numberOfGuests;

    @Column(name = "bookingTotal")
    private Double bookingTotal;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Transient
    private Observer observer;

    public Booking() {

    }

    public Observer getObserver() {
        return observer;
    }

//    public void setBookingTotal(Observer observer, Integer newBookingTotal) {
//        int result = bookingTotal.compareTo(newBookingTotal);
//        if(result==-1){
//            this.observer = observer;
//            this.bookingTotal = newBookingTotal;
//            setChanged();
//            notifyObservers();
//        }
//    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBookingTotal(Double bookingTotal) {
        this.bookingTotal = bookingTotal;
    }

    public Double getBookingTotal() {
        return bookingTotal;
    }
}
