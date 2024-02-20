package com.jhkong.crash.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FirstController {
    @GetMapping("/controller")
    public String test() {
        return "First Controller!";
    }

    @GetMapping("/showMe")
    public List<String> hello() {
        return Arrays.asList("hola", "hi");
    }
    
}