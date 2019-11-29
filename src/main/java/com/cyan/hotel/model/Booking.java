package com.cyan.hotel.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date bookingDate;

    @Column(name = "numberOfGuests")
    private Integer numberOfGuests;

    @Column(name = "bookingTotal")
    private Integer bookingTotal;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Guest guest;

//    private Observer observer;

    public Booking() {

    }

//    public Observer getObserver() {
//        return observer;
//    }

    public Integer getBookingTotal() {
        return bookingTotal;
    }
//
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

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
