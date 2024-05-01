package com.boeing.apmapi.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class controller1 {

    @GetMapping("/")
    public String getRoot() {
        return getLandingPage("unknown");
    }
    

    @GetMapping("/{param}")
    public String getLandingPage(@PathVariable String param ) {
        return "hello the " + param + " landing page";
    }

    
}
