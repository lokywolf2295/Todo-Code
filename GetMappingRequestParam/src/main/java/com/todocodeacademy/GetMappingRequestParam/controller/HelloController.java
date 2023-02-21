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

    @GetMapping("/imc")
    public String exerciseTwo(@RequestParam float weight ,
                           @RequestParam float height){
        float imc = weight / (height*height);
        String status;
        if(imc <= 18.5){
            status = " Your Weigh is Underweight";
        } else if (imc >= 18.6 && imc <= 24.9) {
            status = " Your Weigh is Normal Weight";
        }else {
            status = " Your Weigh is Overweight";
        }

        return "The IMC of a person who weighs: " + weight + " KGms. and measures: " + height + " Mts. is: " + imc + status;

        
    }
}
