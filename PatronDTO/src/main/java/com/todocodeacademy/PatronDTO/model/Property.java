package com.todocodeacademy.PatronDTO.model;

import lombok.Data;

@Data
public class Property {

    private  long idProperty;
    private String propertyType;
    private String address;
    private double squareFootage;
    private double rentalValue;

    public Property(long idProperty, String propertyType, String address, double squareFootage, double rentalValue) {
        this.idProperty = idProperty;
        this.propertyType = propertyType;
        this.address = address;
        this.squareFootage = squareFootage;
        this.rentalValue = rentalValue;
    }
}
