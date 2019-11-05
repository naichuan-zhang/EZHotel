package com.cyan.hotel.controller;

import com.cyan.hotel.entity.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Controller
public class UserController {

    @PostMapping(value = "/register")
    public String register(@ModelAttribute("guestForm") Guest guestForm,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register";
        }

        // TODO: ERROR occurs, need to be changed
        return "redirect:/home";
    }

    @GetMapping(value = "/register")
    public String register(Model model) {

        model.addAttribute("guestForm", new Guest());

        return "register";
    }

    @GetMapping(value = "/login")
    public String login(Model model, String error, String logout) {

        if (null != error)
            model.addAttribute("error", "Invalid username or password!");
        if (null != logout)
            model.addAttribute("logout", "You have logged out successfully!");

        return "login";
    }
}
