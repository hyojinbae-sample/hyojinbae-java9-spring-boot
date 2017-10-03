package com.hyojinbae.sample.java9.spring.boot.impl;

import com.hyojinbae.sample.java9.spring.boot.api.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class HelloImpl implements GreetingService {
    public String greet() {
        return "Hello!";
    }
}
