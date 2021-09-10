package com.example.demo;

import com.example.demo.controller.B;
import com.example.demo.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class GreetingController {
    private GreetingService greetingService;
    private ApplicationContext applicationContext;

    private B b;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;

    }
@Autowired
    public void setGreetingService(GreetingService greetingService, B b) {
        this.greetingService = greetingService;
        this.b = b;
    }

    @GetMapping("/greeting")
//    public String greeting(@RequestParam String name) {
//        return "Hello, " + name + "!";
    public String greeting(@RequestParam(required = false) String name){
        b.displayMsg();
//        return greetingService.createMsg(name);
        return applicationContext.getBean(B.class).toString();
    }
}