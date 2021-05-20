package com.example.covidms.repository;

import com.example.covidms.models.Cas_isamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Cas_isammRep extends JpaRepository<Cas_isamm, Integer> {
    @Query(value="select nombre_cas from cas_isamm where mois= ?1 ",nativeQuery = true)
    Integer findByMois(String mois);

    @Query(value="SELECT SUM(nombre_cas) FROM cas_isamm ",nativeQuery = true)
    Integer SommeCas();
}
