package com.alzirr.alzirr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlzirrController {
    @GetMapping("/")
    String helloWorld(){
        return "Hello World";
    }

}
