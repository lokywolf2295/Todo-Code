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
}
