package com.example.covidms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Décès_CampusManouba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer nombre_décès;

    private String mois;

    public Décès_CampusManouba(Integer id, Integer nombre_décès, String mois) {
        this.id = id;
        this.nombre_décès = nombre_décès;
        this.mois = mois;
    }

    public Décès_CampusManouba() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getNombre_décès() {
        return nombre_décès;
    }

    public String getMois() {
        return mois;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre_décès(Integer nombre_décès) {
        this.nombre_décès = nombre_décès;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }
}
