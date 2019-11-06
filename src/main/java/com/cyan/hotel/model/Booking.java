package com.cyan.hotel.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bookingId")
    private Long bookingId;

    @Column(name = "bookingDate")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date bookingDate;

    @Column(name = "numberOfGuests")
    private Integer numberOfGuests;

    // TODO: add more...

    public Booking() {

    }

}
