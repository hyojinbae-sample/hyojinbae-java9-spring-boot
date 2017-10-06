package com.hyojinbae.sample.java9.spring.boot.impl;

import com.hyojinbae.sample.java9.spring.boot.api.GreetingService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloImpl implements GreetingService {
    public String greet() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss"));
        return String.format("%s    %s", "Hello!", time);
    }
}
