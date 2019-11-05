package com.cyan.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Naichuan Zhang
 * @create: 05-Nov-2019
 **/

@Controller
public class EventController {

    @GetMapping(value = "/event")
    public String event() {
        return "event";
    }
}
