package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public HttpEntity<String> getTest() {
        return new HttpEntity<>("Hello");
    }
}
