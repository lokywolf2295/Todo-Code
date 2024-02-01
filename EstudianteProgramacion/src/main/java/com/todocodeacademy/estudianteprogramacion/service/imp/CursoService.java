package com.todocodeacademy.estudianteprogramacion.service.imp;

import com.todocodeacademy.estudianteprogramacion.model.entity.Curso;
import com.todocodeacademy.estudianteprogramacion.repository.ICursoRepository;
import com.todocodeacademy.estudianteprogramacion.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public void createCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = cursoRepo.findAll();
        return listaCursos;
    }

    @Override
    /**
     * Metodo para encontrar los cursos que contengan una palabra
     * @param palabra
     * @param curso
     * @return cursosConPalabra
     */
    public List<Curso> findCursoByName(String palabra, Curso curso) {
        List<Curso> cursosConPalabra = new ArrayList<>();

        List<Curso> listaCursos = cursoRepo.findAll();

        // Iterar sobre la lista y agregar los cursos que contienen la palabra
        for (Curso c : listaCursos) {
            if (c.getNombre().toLowerCase().contains(palabra.toLowerCase())) {
                cursosConPalabra.add(c);
            }
        }
        return cursosConPalabra;
    }

    @Override
    public Curso findCursoById(Long id_curso) {
        Curso curso = cursoRepo.findById(id_curso).orElse(null);
        return curso;
    }

    @Override
    public void deleteCurso(Long id_curso) {
        cursoRepo.deleteById(id_curso);
    }

    @Override
    public void editCurso(Curso curso) {
        this.createCurso(curso);
    }
}
