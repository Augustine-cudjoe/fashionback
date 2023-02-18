package com.fashionkings.core.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class DemoRestContoller {
    @GetMapping
    public String home(){
        return "the app works fine for me ";
    }
}
