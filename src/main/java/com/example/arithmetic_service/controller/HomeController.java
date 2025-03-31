package com.example.arithmetic_service.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public String greetings() {
        return "Welcome to the arithmetic service!";
    }

}
