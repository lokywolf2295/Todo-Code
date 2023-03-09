package com.todocodeacademy.EjercicioIntegradorN3.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Patient {

    private long id;
    private String dni;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;

    public Patient(long id, String dni, String name, String lastName, LocalDate dateOfBirth) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
}
