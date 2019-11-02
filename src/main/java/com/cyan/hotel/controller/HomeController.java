package com.cyan.hotel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author: Naichuan Zhang
 * @create: 23-Oct-2019
 **/

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Map<String, Object> model) {
        //model.put("message", "home");
        return "home";
    }
}
