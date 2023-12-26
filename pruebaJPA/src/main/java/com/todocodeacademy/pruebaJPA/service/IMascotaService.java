package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;

import java.util.List;

public interface IMascotaService {

    //método para traer todas las mascotas
    //lectura
    public List<Mascota> getMascotas();

    //alta
    public void saveMascota(Mascota mascota);

    //baja
    public void deleteMascota(Long id_mascota);

    //lectura de un solo objeto
    public Mascota findMascota(Long id_mascota);

    //edició/modificación
    public void editMascota(Long idOriginal,
                            Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor
    );
}
