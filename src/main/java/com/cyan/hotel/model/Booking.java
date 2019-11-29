package com.cyan.hotel.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private Long bookingId;

    @Column(name = "bookingDate")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date bookingDate;

    @Column(name = "numberOfGuests")
    private Integer numberOfGuests;

    @OneToMany(mappedBy = "booking")
    private List<Room> rooms;

    public Booking() {

    }

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
}
