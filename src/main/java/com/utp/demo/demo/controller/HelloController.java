package com.utp.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String saludo() {
        return "Hola desde Spring Boot + Jenkins CI";
    }
}
