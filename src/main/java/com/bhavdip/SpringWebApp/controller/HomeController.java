package com.bhavdip.SpringWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello world";
    }

    @RequestMapping("/about")
    public String about() {
        return "Hello from about as well";
    }
}
