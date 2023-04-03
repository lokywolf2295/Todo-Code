package com.todocodeacademy.EjercicioIntegradorN4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageController {

    @GetMapping("/average")
    public String getAverage(@RequestParam double note1, @RequestParam double note2, @RequestParam double note3) {
        double average = (note1 + note2 + note3) / 3;
        return "El promedio obtenio de las tres notas es: " + average;
    }
}
