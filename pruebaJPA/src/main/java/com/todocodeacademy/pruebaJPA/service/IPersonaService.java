package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;
import java.util.List;

public interface IPersonaService {

    //método para traer todas las Personas
    //lectura
    public List<Persona> getPersonas();

    //alta
    public void savePersona(Persona persona);

    //baja
    public void deletePersona(Long id);

    //lectura de un solo objeto
    public Persona findPersona(Long id);

    //edició/modificación
    public void editPersona(Long idOriginal,
                            Long idNuevo,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad
    );

}
