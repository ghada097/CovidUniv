package com.example.covidms.controllers;


import com.example.covidms.models.Cas_CampusManouba;
import com.example.covidms.models.Cas_isamm;
import com.example.covidms.models.Guérisons_isamm;
import com.example.covidms.repository.Cas_CampusManoubaRep;
import com.example.covidms.repository.Cas_isammRep;
import com.example.covidms.repository.Guérisons_isammRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Guérisons_isammController {
    @Autowired
    Guérisons_isammRep repository;

    @GetMapping("/Guérisons")
    public List<Guérisons_isamm> getGuérisons() {
        System.out.println("Get all Guérisons...");

        List<Guérisons_isamm> guérisons = new ArrayList<>();
        repository.findAll().forEach(guérisons::add);

        return guérisons;
    }

    @GetMapping(value = "Guérisons/total")
    public Integer SommeGuérisons() {

        Integer somme_guérisons = repository.SommeGuérisons();
        return somme_guérisons;
    }
}
