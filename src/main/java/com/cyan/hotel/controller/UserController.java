package com.cyan.hotel.controller;

import com.cyan.hotel.model.Guest;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.LoginService;
import com.cyan.hotel.repositoryService.RegistrationService;
import com.cyan.hotel.repository.UserRepository;
import com.cyan.hotel.repositoryService.RegistrationServiceImpl;
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

    @Autowired
    LoginService loginService;

    @Autowired
    RegistrationServiceImpl registrationService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String register(ModelMap modelMap) {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerNewUser(ModelMap model, @RequestParam String firstName, @RequestParam String lastName,
                                  @RequestParam String username, @RequestParam String email, @RequestParam String password){
        boolean canRegister = registrationService.validateRegistration(firstName,lastName,username,password,email);
        if (!canRegister) {
            model.put("errorMessage", "User already exists");
            return "registration";
        }
        model.put("firstName", firstName);
        model.put("lastName", lastName);
        model.put("username", username);
        model.put("email", email);
        model.put("password", password);
        return "home";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = loginService.validateUser(name, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        return "home";
    }

}