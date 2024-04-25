package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class controller1 {

    @GetMapping("/{param}")
    public String getLandinPage(@PathVariable String param ) {
        return "hello the " + param + " landing page";
    }

    
}
