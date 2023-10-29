package com.springBootProject.carRental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @GetMapping("/")
    private String helloWorld() {
        return "HelloWorld!!!";
    }
    @GetMapping("/hii")
    private String hii() {
    	return "hii";
    }

}
