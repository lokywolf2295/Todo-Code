package com.todocodeacademy.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*@GetMapping("/") //si no agrego no funciona para spring 3.0.2 y java 17.0.5
    public String sayHello(){
        return "Hola Mundo! Esto es una prueba";
    }*/

    @GetMapping("/")
    public String practicalExercise(){
        return "Spring Boot es una herramienta para desarrollar APIs en Java";
    }
}
