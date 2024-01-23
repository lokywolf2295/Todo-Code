package com.todocodeacademy.estudianteprogramacion.service;

import com.todocodeacademy.estudianteprogramacion.model.entity.Curso;

import java.util.List;

public interface ICursoService {

//metodo para guardar un curso
    public void createCurso(Curso curso);

//metodo para Listar los cursos
    public List<Curso> getCursos();

    //metodo para encontrar los cursos que contengan una palabra
    public List<Curso> findCurso(String palabra);

    //metodo para encontrar un curso por id
    public Curso findCursoById(Long id_curso);

    //metodo para eliminar un curso por id
    public void deleteCurso(Long id_curso);

    //metodo para editar un curso
    public void editCurso(Curso curso);
}
