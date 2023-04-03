package com.todocodeacademy.EjercicioIntegradorN5.model;

import lombok.Data;

@Data
public class Player {

    private Long id;
    private String dni;
    private String name;
    private String lastName;
    private int age;
    private double weight ;
    private double height;

    public Player(Long id, String dni, String name, String lastName, int age, double weight, double height) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
