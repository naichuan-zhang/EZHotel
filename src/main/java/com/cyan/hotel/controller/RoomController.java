package com.cyan.hotel.controller;

import com.cyan.hotel.enumeration.RoomStyle;
import com.cyan.hotel.model.RoomType;
import com.cyan.hotel.repositoryService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

        ModelAndView model = new ModelAndView("room");
        model.addObject("roomTypesList", roomTypes);

        return model;
    }

    private List<RoomStyle> getRoomTypes() {
        return new ArrayList<RoomStyle>(EnumSet.allOf(RoomStyle.class));
    }
}
