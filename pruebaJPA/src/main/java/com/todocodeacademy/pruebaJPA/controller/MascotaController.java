package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import com.todocodeacademy.pruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas(){
        return mascotaService.getMascotas();
    }

    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "La Mascota fue creada correctamente";
    }

    @DeleteMapping("/mascotas/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascotaService.deleteMascota(id);
        return "La Mascota fue eliminada correctamente";
    }

    @PutMapping("/mascotas/editar/{id_original}")
    public Mascota editMascota(@PathVariable Long id_original,
                              @RequestParam(required = false, name = "id") Long id_mascotaNueva,
                              @RequestParam(required = false, name = "nombre") String nuevoNombre,
                              @RequestParam(required = false, name = "especie") String nuevaEspecie,
                              @RequestParam(required = false, name = "raza") String nuevaRaza,
                              @RequestParam(required = false, name = "color") String nuevoColor
    ){
        mascotaService.editMascota(id_original, id_mascotaNueva, nuevoNombre, nuevaEspecie, nuevaRaza, nuevoColor);
        Mascota mascota = mascotaService.findMascota(id_mascotaNueva);
        return mascota;
    }
}
