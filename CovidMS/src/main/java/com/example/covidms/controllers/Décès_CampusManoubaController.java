package com.example.covidms.controllers;

import com.example.covidms.models.Décès_CampusManouba;
import com.example.covidms.models.Décès_isamm;
import com.example.covidms.repository.Décès_CampusManoubaRep;
import com.example.covidms.repository.Décès_isammRep;
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
public class Décès_CampusManoubaController {
    @Autowired
    Décès_CampusManoubaRep repository;

    @GetMapping("/DécèsCampus")
    public List<Décès_CampusManouba> getDécès() {
        System.out.println("Get all Cas...");

        List<Décès_CampusManouba> décès = new ArrayList<>();
        repository.findAll().forEach(décès::add);

        return décès;
    }

    @GetMapping(value = "DécèsCampus/total")
    public Integer SommeDécès() {

        Integer somme_décès = repository.SommeDécès();
        return somme_décès;
    }

}
