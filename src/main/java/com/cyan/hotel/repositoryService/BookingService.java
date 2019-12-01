package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.User;

import java.util.Date;

/**
 * @author: Naichuan Zhang
 * @create: 30-Nov-2019
 **/

public interface BookingService {

    void insertBooking(String bookingDate, Integer numberOfGuests, Double bookingTotal, String username);
    Booking findBookingByUser(User user);
}
