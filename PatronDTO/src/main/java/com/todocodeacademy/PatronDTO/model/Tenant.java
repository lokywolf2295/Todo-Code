package com.todocodeacademy.PatronDTO.model;

import lombok.Data;

@Data
public class Tenant {

    private  long idTenant;
    private String dni;
    private String name;
    private String lastName;
    private String profession;

    public Tenant(long idTenant, String dni, String name, String lastName, String profession) {
        this.idTenant = idTenant;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
    }
}
