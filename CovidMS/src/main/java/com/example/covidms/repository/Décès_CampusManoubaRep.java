package com.example.covidms.repository;

import com.example.covidms.models.Décès_CampusManouba;
import com.example.covidms.models.Décès_isamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Décès_CampusManoubaRep extends JpaRepository<Décès_CampusManouba, Integer> {

    @Query(value = "SELECT SUM(nombre_décès)FROM décès_campus_manouba ", nativeQuery = true)
    Integer SommeDécès();
}