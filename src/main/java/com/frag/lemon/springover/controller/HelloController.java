package com.frag.lemon.springover.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!!!";
    }

    @RequestMapping("/getUser")
    public String getUser(String name) {
        return "User的name: " + name;
    }
}
