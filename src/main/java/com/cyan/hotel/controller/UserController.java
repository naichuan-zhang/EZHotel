package com.cyan.hotel.controller;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.UserService;
import com.cyan.hotel.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(@ModelAttribute("userForm") User userForm, BindingResult result, ModelMap model) {
        userValidator.validate(userForm, result);

        if (result.hasErrors()) {
            return "register";
        }

        userService.save(userForm);

        model.addAttribute("username", userForm.getUsername());

        return "redirect:/login";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = userService.validateUser(name, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);

        model.addAttribute("username", name);
        model.addAttribute("login", "true");

        return "home";
    }
}