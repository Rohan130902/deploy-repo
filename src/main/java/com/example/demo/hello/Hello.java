package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
 @GetMapping("/hello")
    public String sayHello() {



     
        return "Hello, Spring Boot API is working ,testing docker 1!";
    }
    
    @GetMapping("/")
    public String home() {
        return "Welcome! Your Spring Boot API is running 🚀";
    }














 
}
