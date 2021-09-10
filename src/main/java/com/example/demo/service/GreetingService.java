package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.StringJoiner;

@Service
public class GreetingService {
    public  String createMsg(String name){
        StringJoiner joiner = new StringJoiner(", ","","!");
        joiner.add("Hello");
        if (name == null || name.isEmpty()){
            joiner.add("world");
        } else {
            joiner.add(name);
        }
        return String.valueOf(joiner);
    }
}
