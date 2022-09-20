package com.lifeshadow.springboottutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWord(){
        return "hii sjdkfssdf ** asdad";
    }
}
