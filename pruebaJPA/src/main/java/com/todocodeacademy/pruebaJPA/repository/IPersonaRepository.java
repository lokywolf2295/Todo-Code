package com.todocodeacademy.pruebaJPA.repository;
import com.todocodeacademy.pruebaJPA.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //mapeamos como repositorio
//la interface extiende de JpaRepository (que maneja repositorios JPA)
//en los parámetros ‹› deben ir: ‹clase a persistir, tipo de dato de su ID›
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
}
