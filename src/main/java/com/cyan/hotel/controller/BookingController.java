package com.cyan.hotel.controller;

import com.cyan.hotel.model.*;
import com.cyan.hotel.repositoryService.BookingService;
import com.cyan.hotel.repositoryService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 05-Nov-2019
 **/

@Controller
public class BookingController {

    @Autowired
    private RoomService roomService;

    @Autowired
    private BookingService bookingService;

//    @GetMapping(value = "/booking")
//    public String booking() {
//        return "booking";
//    }

    @GetMapping(value = "/booking/{roomId}")
    public String getRoomIdForBooking(@PathVariable Long roomId, Model model) {
        Room room = roomService.findRoomByRoomId(roomId);

        model.addAttribute("room", room);
        model.addAttribute("roomId", roomId);

        return "booking";
    }

    @GetMapping(value = "/booking/user/{username}/{roomType}/{price}")
    public String getUsername(@PathVariable String username,
                              @PathVariable String roomType,
                              @PathVariable Double price,
                              @RequestParam("numOfGuests") Integer numOfGuests,
                              @RequestParam("extras") String extrasList, Model model) {

        if (!username.isEmpty()) {

            Double bookingTotalPrice = getTotalPrice(extrasList, roomType, price);

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            bookingService.insertBooking(formatter.format(date), numOfGuests, bookingTotalPrice, username);

            return "redirect:/payment/" + username + "/" + bookingTotalPrice;
        } else {
            return "redirect:/booking/failed/";
        }
    }

//    @GetMapping(value = "booking/success/")
//    public String success() {
//        return "home";
//    }

    @GetMapping(value = "booking/failed/")
    public String failed() {
        return "home";
    }

    private Double getTotalPrice(String extrasList, String roomType, Double price) {

        Room room = null;
        if (roomType.equalsIgnoreCase("EXECUTIVE")) {
            room = new ExecutiveRoom();
        } else if (roomType.equalsIgnoreCase("SINGLE")) {
            room = new SingleRoom();
        } else if (roomType.equalsIgnoreCase("DOUBLE")) {
            room = new DoubleRoom();
        } else if (roomType.equalsIgnoreCase("JUNIORSUITE")) {
            room = new JuniorSuiteRoom();
        }

        if (extrasList != null) {
            String[] values = extrasList.split(",");
            List<String> extras = new ArrayList<>(Arrays.asList(values));

            for(String extra : extras){
                switch (extra) {
                    case "AC":
                        room = new withAC(room);
                        break;
                    case "BottleOfWine":
                        room = new withBottleOfWine(room);
                        break;
                    case "Dinner":
                        room = new withDinner(room);
                        break;
                    case "WiFi":
                        room = new withWiFi(room);
                        break;
                }
            }

            assert room != null;
            return room.getPrice();
        }

        return price;
    }
}
