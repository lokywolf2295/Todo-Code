package com.todocodeacademy.EjercicioIntegradorN1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LitersController {

    @GetMapping("/gallonsToLiters/{gallons}")
    public String gallonsToLiters(@PathVariable float gallons){
        float liters = (float) (gallons * 3.78541);
        return "The tourist needs to carry: " + gallons + " Gallons, which is equivalent to: " + liters + " Liters, to fill the fuel tank";
    }

}
