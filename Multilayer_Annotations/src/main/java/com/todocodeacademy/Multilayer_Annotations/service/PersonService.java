package com.todocodeacademy.Multilayer_Annotations.service;

import com.todocodeacademy.Multilayer_Annotations.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service /*Agregamos la anotación para informar que esta clase es de tipo servicio*/
public class PersonService implements IPersonService {

    @Override
    public void createPerson(Person per) {
        //lógica de creación
        System.out.println("Persona Creada");
    }

    @Override
    public List<Person> getPeople() {
        //acá debería ir la lógica de devolver la lista de personas
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //métodos de lógica de negocio
}
