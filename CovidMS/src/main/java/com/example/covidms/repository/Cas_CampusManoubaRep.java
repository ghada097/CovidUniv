package com.example.covidms.repository;

import com.example.covidms.models.Cas_CampusManouba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Cas_CampusManoubaRep extends JpaRepository<Cas_CampusManouba, Integer> {
    @Query(value="SELECT SUM(nombre_cas) FROM cas_campus_manouba ",nativeQuery = true)
    Integer SommeCas();
}
