package com.todocodeacademy.EjercicioIntegradorN5.controller;

import com.todocodeacademy.EjercicioIntegradorN5.model.Player;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayersController {

    @PostMapping("/players")
 public String calculateAverageStature(@RequestBody List<Player> playersList){

        double sumStature = 0.0;
        double averageStature = 0.0;

        //guardamos la lista en nuestra base de datos "lógica" en forma de ArrayList
        //para cumplir con lo que pide el POST, que es un alta

        List<Player> players = new ArrayList<>();
        players = playersList;

        //sumamos las alturas
        for (Player player : players) {
            sumStature = sumStature + player.getHeight();
        }

        averageStature = sumStature / (players.size());

        //como "response" al alta, otorgamos como dato la estatura de los jugadores
        return "Jugadores registrados correctamente. El promedio de estatura de los mismos es: " + averageStature;

    }
}
