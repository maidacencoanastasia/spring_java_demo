package com.example.demo;

import com.example.demo.service.GreetingService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    private GreetingService greetingService;
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;

    }

    @GetMapping("/greeting")
//    public String greeting(@RequestParam String name) {
//        return "Hello, " + name + "!";
    public String greeting(@RequestParam(required = false) String name){
        return greetingService.createMsg(name);
    }
}