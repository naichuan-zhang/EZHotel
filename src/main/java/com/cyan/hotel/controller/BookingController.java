package com.cyan.hotel.controller;

import com.cyan.hotel.model.Room;
import com.cyan.hotel.model.RoomType;
import com.cyan.hotel.repositoryService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 05-Nov-2019
 **/

@Controller
public class BookingController {

    @Autowired
    private RoomService roomService;

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

    @GetMapping(value = "/booking/user/{username}")
    public String getUsername(@PathVariable String username, Model model) {

        return "redirect:/booking/success";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String initForm(Model model) {
//        RoomType roomType = new RoomType();
//        model.addAttribute("roomType", roomType);
//        initRoomTypesList(model);
//        return "roomType";
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String submitForm(Model model, @Validated RoomType roomType, BindingResult result) {
//        model.addAttribute("roomType", roomType);
//        String returnVal = "successRoomType";
//        if(result.hasErrors()) {
//            initRoomTypesList(model);
//            returnVal = "roomType";
//        } else {
//            model.addAttribute("roomType", roomType);
//        }
//        return returnVal;
//    }
//
//
//    private void initRoomTypesList(Model model){
//        List<String> roomTypesList = new ArrayList<String>();
//        roomTypesList.add("Executive Room");
//        roomTypesList.add("Double Room");
//        roomTypesList.add("Single Room");
//        model.addAttribute("roomTypes", roomTypesList);
//    }
}
