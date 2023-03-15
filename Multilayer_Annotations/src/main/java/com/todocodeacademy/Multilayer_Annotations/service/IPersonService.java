
package com.todocodeacademy.Multilayer_Annotations.service;

import com.todocodeacademy.Multilayer_Annotations.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {
    
    //declarando métodos sin implementar
    public void createPerson(Person person);
    public List<Person> getPeople();
    
}
