package com.example.covidms.controllers;


import com.example.covidms.models.Cas_CampusManouba;
import com.example.covidms.models.Cas_isamm;
import com.example.covidms.repository.Cas_CampusManoubaRep;
import com.example.covidms.repository.Cas_isammRep;
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
public class Cas_CampusManoubaController {
    @Autowired
    Cas_CampusManoubaRep repository;

    @GetMapping("/CasCampus")
    public List<Cas_CampusManouba> getCasCampus() {
        System.out.println("Get all Cas...");

        List<Cas_CampusManouba> cas = new ArrayList<>();
        repository.findAll().forEach(cas::add);

        return cas;
    }

    @GetMapping(value = "CasCampus/total")
    public Integer SommeCas() {

        Integer somme_cas = repository.SommeCas();
        return somme_cas;
    }
}
