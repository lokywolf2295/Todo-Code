package com.todocodeacademy.estudianteprogramacion.service;

import com.todocodeacademy.estudianteprogramacion.model.entity.Tema;

import java.util.List;

public interface ITemaService {

    //metodo para guardar un tema relacionado con un curso
    public void createTema(Tema tema);

    //metodo para encontrar todos los temas
    public List<Tema> getTemas();

    //metodo para encontrar un tema por id
    public Tema findTemaById(Long id_tema);

    //metodo para encontrar los temas de un curso
    public List<Tema> findTemasByCurso(Long id_curso);

    //metodo para eliminar un tema por id
    public void deleteTema(Long id_tema);

    //metodo para editar un tema
    public void editTema(Tema tema);
}
