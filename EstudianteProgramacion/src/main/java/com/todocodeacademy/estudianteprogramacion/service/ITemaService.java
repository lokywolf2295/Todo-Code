package com.todocodeacademy.estudianteprogramacion.service;

import com.todocodeacademy.estudianteprogramacion.model.entity.Curso;
import com.todocodeacademy.estudianteprogramacion.model.entity.Tema;

public interface ITemaService {

    //metodo para guardar un tema relacionado con un curso
    public void createTema(Tema tema, Curso id_curso);

    //metodo para encontrar los temas de un curso
    public void findTemasByCurso(Curso id_curso);

    //metodo para encontrar un tema por id
    public void findTemaById(Long id_tema);

    //metodo para eliminar un tema por id
    public void deleteTema(Long id_tema);

    //metodo para editar un tema
    public void editTema(Tema tema);
}
