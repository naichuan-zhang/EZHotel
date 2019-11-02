package com.cyan.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Controller
public class UserController {

    @RequestMapping(value = "/register")
    public String register(Map<String, Object> model) {
        //model.put("message", "home");
        return "register";
    }

    @RequestMapping(value = "/login")
    public String login(Map<String, Object> model) {
        //model.put("message", "home");
        return "login";
    }
}
