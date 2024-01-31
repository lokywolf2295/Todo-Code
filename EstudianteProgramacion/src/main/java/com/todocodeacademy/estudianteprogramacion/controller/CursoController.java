package com.todocodeacademy.estudianteprogramacion.controller;

import com.todocodeacademy.estudianteprogramacion.model.entity.Curso;
import com.todocodeacademy.estudianteprogramacion.service.imp.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping("/cursos/crear")
    public String createCurso(@RequestBody Curso curso) {
        cursoService.createCurso(curso);
        return "El curso fue creado correctamente";
    }

    @GetMapping("/cursos/traer")
    public List<Curso> getCursos() {
        return cursoService.getCursos();
    }

    @GetMapping("/cursos/buscar/{palabra}")
    public List<Curso> findCursoByName(@PathVariable String palabra, Curso curso) {
        return cursoService.findCursoByName(palabra, curso);
    }


    @DeleteMapping("/cursos/borrar/{id_curso}")
    public String deleteCurso(@PathVariable Long id_curso) {
        if (cursoService.findCursoById(id_curso) == null) {// Verificar que el curso exista (no es null
            return "El curso no existe";
        } else {
            cursoService.deleteCurso(id_curso);
            return "El curso fue eliminado correctamente";
        }
    }

    @PutMapping("/cursos/editar")
    public String editCurso(@RequestBody Curso curso) {
        cursoService.editCurso(curso);
        return "El curso fue editado correctamente";
    }
}
