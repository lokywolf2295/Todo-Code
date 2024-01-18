package com.todocodeacademy.estudianteprogramacion.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private Date fecha_finalizacion;
    @OneToMany
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, Date fecha_finalizacion, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaDeTemas = listaDeTemas;
    }
}
