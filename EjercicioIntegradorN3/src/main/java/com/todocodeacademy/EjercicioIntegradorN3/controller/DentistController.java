package com.todocodeacademy.EjercicioIntegradorN3.controller;

import com.todocodeacademy.EjercicioIntegradorN3.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DentistController {

    @GetMapping("patient")
    public  List<Patient> getAllPatients(){

        List<Patient> listPatient = new ArrayList<Patient>();

        //simulamos la bd lógica agregando elementos a la lista
        listPatient.add(new Patient(1, "12345678", "Matias", "Carballo", "11/06/1995"));
        listPatient.add(new Patient(2, "23456789", "Vanesa", "Silva", "22/01/1993"));
        listPatient.add(new Patient(3, "01234567", "Zoe", "Carballo", "01/01/2001"));
        listPatient.add(new Patient(4, "34567890", "Nicolas", "Carballo", "03/03/2003"));
        listPatient.add(new Patient(5, "4567801", "Luisina", "de Paula", "23/11/1992"));

        //retorno la lista de los pacientes
        return listPatient;
    }
}
