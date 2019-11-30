package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Booking;

import java.util.Date;

/**
 * @author: Naichuan Zhang
 * @create: 30-Nov-2019
 **/

public interface BookingService {

    void insertBooking(String bookingDate, Integer numberOfGuests, Integer bookingTotal, String username);
}
