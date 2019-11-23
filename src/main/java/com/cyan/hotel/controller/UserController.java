package com.cyan.hotel.controller;

import com.cyan.hotel.model.Guest;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.LoginService;
import com.cyan.hotel.repositoryService.RegistrationService;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String register(ModelMap modelMap) {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String login(Model model, String error, String logout) {


        return "home";
    }
}