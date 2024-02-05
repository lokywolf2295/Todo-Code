package com.todocodeacademy.estudianteprogramacion.controller;

import com.todocodeacademy.estudianteprogramacion.model.entity.Tema;
import com.todocodeacademy.estudianteprogramacion.service.imp.TemaSercive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    private TemaSercive temaService;

    @PostMapping("/temas/crear")
    public String createTema(@RequestBody Tema tema) {
        temaService.createTema(tema);
        return "El Tema fue creado correctamente";
    }

    @GetMapping("/temas/traer")
    public List<Tema> getTemas() {
        return temaService.getTemas();
    }

    @GetMapping("/temas/buscar/{id_curso}")
    public List<Tema> findTemasByCurso(@PathVariable Long id_curso) {
        return temaService.findTemasByCurso(id_curso);
    }


    @DeleteMapping("/temas/borrar/{id_Tema}")
    public String deleteTema(@PathVariable Long id_Tema) {
        if (temaService.findTemaById(id_Tema) == null) {// Verificar que el Tema exista (no es null
            return "El Tema no existe";
        } else {
            temaService.deleteTema(id_Tema);
            return "El Tema fue eliminado correctamente";
        }
    }

    @PutMapping("/temas/editar")
    public String editTema(@RequestBody Tema Tema) {
        temaService.editTema(Tema);
        return "El Tema fue editado correctamente";
    }
}
