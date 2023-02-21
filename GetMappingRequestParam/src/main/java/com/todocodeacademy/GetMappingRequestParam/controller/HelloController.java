package com.todocodeacademy.GetMappingRequestParam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name,
                           @RequestParam int age,
                         @RequestParam String profession){
        return "Hello World! Name: " + name + " Age: " + age + " Profession: " + profession;
    }

    @GetMapping("/sum/{num1}/{num2}")
    public String exerciseOne(@PathVariable int num1,
                           @PathVariable int num2){
        int sum = num1 + num2;
        return "The sum of Number 1: " + num1 + " + Number 2: " + num2 + " is: " + sum;
    }
}
