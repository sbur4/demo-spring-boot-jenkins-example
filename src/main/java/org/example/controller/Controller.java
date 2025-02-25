package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/login")
    public String hello() {
        System.out.println("Hello, EPAM!");
        return "Hello, EPAM!";
    }

    @GetMapping("/logout")
    public String logout() {
        System.out.println("See you soon!");
        return "See you soon!";
    }
}