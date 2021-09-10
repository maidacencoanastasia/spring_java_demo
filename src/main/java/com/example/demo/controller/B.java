package com.example.demo.controller;

public class B {
    private A a;
    public B(A a){
        this.a = a;
    }

    public void displayMsg(){
        System.out.println(a.createMsg());
    }
}
