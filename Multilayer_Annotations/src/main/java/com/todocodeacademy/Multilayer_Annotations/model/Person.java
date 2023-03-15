
package com.todocodeacademy.Multilayer_Annotations.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
    
    private Long id;
    private String name;
    private String lastName;

    public Person() {
    }

    public Person(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

}
