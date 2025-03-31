package com.example.arithmetic_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
@CrossOrigin
public class ArithmeticController {
    @GetMapping("/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m) {
        return n + m;
    }
}