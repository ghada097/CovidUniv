package com.example.covidms.controllers;


import com.example.covidms.models.Cas_isamm;
import com.example.covidms.repository.Cas_isammRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Cas_isammController {
    @Autowired
    Cas_isammRep repository;

    @GetMapping("/Cas")
    public List<Cas_isamm> getAllCas() {
        System.out.println("Get all Cas...");

        List<Cas_isamm> cas = new ArrayList<>();
        repository.findAll().forEach(cas::add);

        return cas;
    }

    @GetMapping(value = "Cas/mois/{mois}")
    public Integer findByMois(@PathVariable String mois) {

        Integer nombre_cas = repository.findByMois(mois);
        return nombre_cas;
    }

    @GetMapping(value = "Cas/total")
    public Integer SommeCas() {

        Integer somme_cas = repository.SommeCas();
        return somme_cas;
    }
}
