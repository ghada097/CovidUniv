package com.example.covidms.repository;


import com.example.covidms.models.Guérisons_isamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Guérisons_isammRep extends JpaRepository<Guérisons_isamm, Integer> {
    @Query(value="SELECT SUM(nombre_guérisons) FROM guérisons_isamm ",nativeQuery = true)
    Integer SommeGuérisons();
}
