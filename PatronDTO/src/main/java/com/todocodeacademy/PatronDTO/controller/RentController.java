package com.todocodeacademy.PatronDTO.controller;

import com.todocodeacademy.PatronDTO.dto.PropertyDTO;
import com.todocodeacademy.PatronDTO.model.Property;
import com.todocodeacademy.PatronDTO.model.Tenant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentController {

    @GetMapping("/property/{id}")
    @ResponseBody
    public PropertyDTO returnProperty(@PathVariable long id){
        //simulamos que obtenemos una propiedad por su id y su inquilino desde una DB
        Tenant tenant1 = new Tenant(1L,"12345678","Matias","Carballo","TodoCoder");
        Property property1= new Property(1L, "Casa", "Av. Siempre Viva 742", 200.0,50000.0);

        PropertyDTO propertyDTO = new PropertyDTO();

        //Unifico los datos del inquilino y de la propiedad usando el DTO
        propertyDTO.setIdProperty(property1.getIdProperty());
        propertyDTO.setPropertyType(property1.getPropertyType());
        propertyDTO.setAddress(property1.getAddress());
        propertyDTO.setRentalValue(property1.getRentalValue());
        propertyDTO.setNameTenant(tenant1.getName());
        propertyDTO.setLastNameTenant(tenant1.getLastName());

        return propertyDTO;
    }
}
