package com.demo.volunteercentral.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public HomeController() {
    }

    @GetMapping({"/"})
    public String index() {
        return "Greetings from Volunteer Central!";
    }
}