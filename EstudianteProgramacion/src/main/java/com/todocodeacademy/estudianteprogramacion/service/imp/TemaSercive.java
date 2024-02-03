package com.todocodeacademy.estudianteprogramacion.service.imp;

import com.todocodeacademy.estudianteprogramacion.model.entity.Curso;
import com.todocodeacademy.estudianteprogramacion.model.entity.Tema;
import com.todocodeacademy.estudianteprogramacion.repository.ITemaRepository;
import com.todocodeacademy.estudianteprogramacion.service.ITemaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TemaSercive implements ITemaService {

    @Autowired
    private ITemaRepository temaRepo;
    @Autowired
    private CursoService cursoService;

    @Override
    public void createTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTemas = temaRepo.findAll();
        return listaTemas;
    }

    @Override
    public Tema findTemaById(Long id_tema) {
        Tema tema = temaRepo.findById(id_tema).orElse(null);
        return tema;
    }

    @Override
    public List<Tema> findTemasByCurso(Long id_curso) {
        Curso curso = cursoService.findCursoById(id_curso);

        if (curso != null) {
            return curso.getListaDeTemas();
        }else {
            return new ArrayList<>();
        }
    }

    @Override
    public void deleteTema(Long id_tema) {
        temaRepo.deleteById(id_tema);
    }

    @Override
    public void editTema(Tema tema) {
        this.createTema(tema);
    }
}
