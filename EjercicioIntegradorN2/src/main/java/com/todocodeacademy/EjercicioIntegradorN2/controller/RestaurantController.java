package com.todocodeacademy.EjercicioIntegradorN2.controller;

import com.todocodeacademy.EjercicioIntegradorN2.model.Dish;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/dish/{num_dish}")
    @ResponseBody
    public Dish getDishes(@PathVariable int num_dish) {

        List<Dish> listDish = new ArrayList<Dish>();
        //simulamos la bd lógica agregando elementos a la lista
        listDish.add(new Dish(1, "Milanese with Mashed Potatoes", 500.00, "Simple Milanese with Mashed Potatoes, without Neapolitan"));
        listDish.add(new Dish(2, "Ravioli with Bolognese Sauce", 850.00, "Vegetable or ricotta ravioli with bolognese sauce and grated cheese"));
        listDish.add(new Dish(3, "Mustard tenderloin with fries", 1200.00, "Tenderloin bides with mustard sauce and French fries"));
        listDish.add(new Dish(4, "Mixed Salad", 350.00, "Lettuce, tomato, egg, carrot and onion salad"));
        listDish.add(new Dish(5, "Milanese with spring rice", 500.00, "Simple Milanese, without Neapolitan with rice and vegetables"));

        //buscamos en la lista de platos a ver si hay uno con esa numero
        for (Dish dish : listDish) {
            if (dish.getNum() == num_dish) {
                //Si encontró devuelve el plato completo
                return dish;
            }
        }

        //si no encontró nada, devuelve null
        return null;
    }
}
