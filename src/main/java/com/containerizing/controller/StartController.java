package com.containerizing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/start")
    public String letStart() {
        return "Hello from Docker";
    }

}