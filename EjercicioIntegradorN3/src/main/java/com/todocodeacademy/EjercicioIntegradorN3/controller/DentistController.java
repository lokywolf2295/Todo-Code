package com.todocodeacademy.EjercicioIntegradorN3.controller;

import com.todocodeacademy.EjercicioIntegradorN3.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DentistController {

    @GetMapping("patient")
    public  List<Patient> getAllPatients(){

        List<Patient> listPatient = new ArrayList<Patient>();

        //simulamos la bd lógica agregando elementos a la lista
        listPatient.add(new Patient(1, "12345678", "Matias", "Carballo", LocalDate.of(1995,06,11)));
        listPatient.add(new Patient(2, "23456789", "Vanesa", "Silva", LocalDate.of(1993,01,22)));
        listPatient.add(new Patient(3, "01234567", "Zoe", "Carballo", LocalDate.of(2003,01,01)));
        listPatient.add(new Patient(4, "34567890", "Nicolas", "Carballo", LocalDate.of(2001,03,03)));
        listPatient.add(new Patient(5, "4567801", "Luisina", "de Paula", LocalDate.of(1992,11,23)));

        //retorno la lista de los pacientes
        return listPatient;
    }

    @GetMapping("patient/minors")
    public  List<Patient> getMinors(){

        List<Patient> listPatient = new ArrayList<Patient>();

        //simulamos la bd lógica agregando elementos a la lista
        listPatient.add(new Patient(1, "12345678", "Matias", "Carballo", LocalDate.of(1995,06,11)));
        listPatient.add(new Patient(2, "23456789", "Vanesa", "Silva", LocalDate.of(1993,01,22)));
        listPatient.add(new Patient(3, "01234567", "Zoe", "Carballo", LocalDate.of(2017,01,01)));
        listPatient.add(new Patient(4, "34567890", "Nicolas", "Carballo", LocalDate.of(2019,03,03)));
        listPatient.add(new Patient(5, "4567801", "Luisina", "de Paula", LocalDate.of(1992,11,23)));

        List<Patient> listPatientMinors = new ArrayList<Patient>();

        //recorremos la lista de pacientes
        for(Patient patient : listPatient) {
            //fecha actual para luego verificar la edad
            LocalDate now = LocalDate.now();

            //obtener la edad actual del paciente mediante la comparacinon entre la fecha de nacimiento y la actual
            Period actualAge = Period.between(patient.getDateOfBirth(),now);

            if(actualAge.getYears()<18){
                System.out.println("Actual Age: " + actualAge.getYears());
                listPatientMinors.add(patient);
            }

        }
        //retorno la lista de los pacientes
        return listPatientMinors;
    }
}
