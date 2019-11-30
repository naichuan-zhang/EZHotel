package com.cyan.hotel.controller;

import com.cyan.hotel.enumeration.RoomStyle;
import com.cyan.hotel.model.ExecutiveRoom;
import com.cyan.hotel.model.Room;
import com.cyan.hotel.model.RoomType;
import com.cyan.hotel.repositoryService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping(value = "/room")
    public ModelAndView show() {
        List<RoomStyle> roomTypes = getRoomTypes();
        List<String> roomsList = new ArrayList<String>();
        roomsList.add("1");
        roomsList.add("2");
        roomsList.add("3");
        roomsList.add("4");
        roomsList.add("5");

        ModelAndView model = new ModelAndView("room");
        model.addObject("roomTypesList", roomTypes);
        model.addObject("room", roomsList);

        return model;
    }

    @GetMapping(value = "/room/show/{roomType}")
    public String getRoomType(@PathVariable String roomType, Model model) {

        List<Room> roomList = roomService.getRoomsByRoomType(roomType);
        model.addAttribute("roomList", roomList);
        model.addAttribute("roomType", roomType);
        return "/room";
    }

    @GetMapping(value = "/room/show")
    public String getRoomTypeByForm(@RequestParam("roomTypesList") String roomType) {

        if (!roomType.isEmpty()) {
            return "redirect:/room/show/" + roomType;
        }

        return "/room";
    }

    private List<RoomStyle> getRoomTypes() {
        return new ArrayList<RoomStyle>(EnumSet.allOf(RoomStyle.class));
    }
}
