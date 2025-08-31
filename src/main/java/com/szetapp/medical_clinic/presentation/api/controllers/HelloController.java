package com.szetapp.medical_clinic.presentation.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/app/foo")
    public Map<String, Object> foo() {
        Map<String, Object> json = new HashMap<>();
        json.put("message", "Hola Spring Boot");
        json.put("date", new Date());
        int a = 2;
        int b = 3;
        int x = a + b;
        return json;
    }
}

