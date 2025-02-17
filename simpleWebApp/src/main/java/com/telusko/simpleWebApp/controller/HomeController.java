package com.telusko.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Greet method class...... ";

    }

    @RequestMapping("/about")
    public String about() {
        return "about method  class...... ";
    }
}