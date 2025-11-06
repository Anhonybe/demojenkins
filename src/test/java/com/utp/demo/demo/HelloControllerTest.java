package com.utp.demo.demo;

import org.junit.jupiter.api.Test;

import com.utp.demo.demo.controller.HelloController;

import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {
    @Test
    void testSaludo() {
        HelloController controller = new HelloController();
        assertEquals("Hola desde Spring Boot + Jenkins CI", controller.saludo());
    }
}
