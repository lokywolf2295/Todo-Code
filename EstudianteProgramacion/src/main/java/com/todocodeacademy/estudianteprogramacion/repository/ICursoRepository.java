package com.todocodeacademy.estudianteprogramacion.repository;

import com.todocodeacademy.estudianteprogramacion.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
