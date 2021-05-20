package com.example.covidms.repository;


import com.example.covidms.models.Décès_isamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Décès_isammRep extends JpaRepository<Décès_isamm, Integer> {

    @Query(value="SELECT SUM(nombre_décès)FROM décès_isamm ",nativeQuery = true)
    Integer SommeDécès();
}
