package com.exampletestprojects.testprojects.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping (path ="/hello")
    public String sayHello(){
        return "Hello World";

    }

}
