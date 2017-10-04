package com.hyojinbae.sample.java9.spring.boot.controller;

import com.hyojinbae.sample.java9.spring.boot.api.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingService service;
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String control() {
        return this.service.greet();
    }

}
