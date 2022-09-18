package com.api.doc.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class WelcomeSwagger {

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to swagger demo in spring boot application";
    }
}
