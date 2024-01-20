package com.todocodeacademy.estudianteprogramacion.repository;

import com.todocodeacademy.estudianteprogramacion.model.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
