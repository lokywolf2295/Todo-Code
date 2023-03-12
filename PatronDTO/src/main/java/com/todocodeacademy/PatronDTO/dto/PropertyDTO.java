package com.todocodeacademy.PatronDTO.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PropertyDTO implements Serializable {

    private  long idProperty;
    private String propertyType;
    private String address;
    private double rentalValue;
    private String nameTenant;
    private String lastNameTenant;


}
