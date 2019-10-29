package com.cyan.hotel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class WelcomeController {

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping(value = "/")
    public String index(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
}
