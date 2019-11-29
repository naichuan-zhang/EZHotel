package com.cyan.hotel.controller;

import com.cyan.hotel.repositoryService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Controller
@RequestMapping(value = "/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/")
    public String show() {
        return "room";
    }

    @RequestMapping(value = "/roomId")
    public String getRoomId(@RequestParam("roomId") Long roomId) {
        return "returned Room with id: " + roomId;
    }
}
