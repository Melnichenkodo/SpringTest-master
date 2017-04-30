package com.brina.controller;

import com.brina.model.User;
import com.brina.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        Model model) {

        if (error != null) {
            model.addAttribute("error", "Invalid user name or password");
        }
        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully");
        }
        model.addAttribute("newUser", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("newUser") User user, Model model) {
        User existingUser = userService.findUser(user);
        if (existingUser != null) {
            model.addAttribute("userFromDB", existingUser);
            return "welcome";
        }
        return "error";
    }

//    @RequestMapping(value = "/registration")
//    public String addUser(Model model) {
//        model.addAttribute("newUser");
//        return "registration";
//    }
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String addUser(@ModelAttribute("newUser") User user, Model model) {
//        model.addAttribute("welcomeUser", userService.addUser(user));
//        return "welcome";
//    }

    @RequestMapping("/register")
    public String registration(Model model) {
        model.addAttribute("newUser", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registration(@ModelAttribute("newUser") User user, Model model) {
        User existingUser = userService.addUser(user);
        if (existingUser != null) {
            model.addAttribute("userFromDB", existingUser);
        }
        return "welcome";
    }

}
