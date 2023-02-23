package com.todocodeacademy.ResponseBodyResponseEmtity.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private long id;
    private String name;
    private String lastName;

    public Client(){

    }

    public Client(long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
}
