package com.todocodeacademy.EjercicioIntegradorN2.model;

import lombok.Data;

@Data
public class Dish {

    private int num;
    private String name;
    private double price;
    private String description;

    public Dish(int num, String name, double price, String description) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
