package com.todocodeacademy.GetMappingPathVariable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello World! " + name;
    }

    @GetMapping("/bye/{name}/{age}/{profession}")
    public String sayBye(@PathVariable String name,
                         @PathVariable int age,
                         @PathVariable String profession){
        return "Bye World! Your Name: " + name + " Your Age: " + age + " Your Profession: " + profession;
    }
}
