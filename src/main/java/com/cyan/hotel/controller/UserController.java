package com.cyan.hotel.controller;

import com.cyan.hotel.model.Guest;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.LoginService;
import com.cyan.hotel.repositoryService.RegistrationService;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/


@Controller

public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/registration")
    @ResponseBody
    public String register(@RequestBody User user, HttpServletRequest request) {
        Boolean success = true;

        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String userName = user.getUsername();
        String password = user.getPassword();

        userRepository.save(user);

        if(success == true) {return "success";}
        else {return "failure";}

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