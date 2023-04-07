package com.todocodeacademy.EjercicioIntegradorN6.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleController {

    @PostMapping("/triangle")
    public String calculateAreaTriangle(@RequestParam double base, @RequestParam double height){

        double area = (base*height)/2; //calculamos el area del triangulo

        return "El área del triángulo que tiene como base: " + base +" y como altura: "+ height +" es: " + area;
    }
}
