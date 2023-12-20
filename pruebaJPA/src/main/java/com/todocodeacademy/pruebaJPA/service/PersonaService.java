package com.todocodeacademy.pruebaJPA.service;
import com.todocodeacademy.pruebaJPA.model.Persona;
import com.todocodeacademy.pruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository persoRepo;

        @Override
        public List<Persona> getPersonas() {
            List<Persona> listaPersonas = persoRepo.findAll();
            return listaPersonas;
        }

        @Override
        public void savePersona(Persona persona) {
            persoRepo.save(persona);
        }

        @Override
        public void deletePersona(Long id) {
            persoRepo.deleteById(id);
        }

        @Override
        public Persona findPersona(Long id) {
            Persona persona = persoRepo.findById(id).orElse(null);
            return persona;
        }

    @Override
    public void editPersona(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        //Busco el objeto original
        Persona persona = this.findPersona(idOriginal);

        //Modifico los atributos a nivel lógico
        persona.setId(idNuevo);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevaEdad);

        //Guardar los cambios
        this.savePersona(persona);
    }

}