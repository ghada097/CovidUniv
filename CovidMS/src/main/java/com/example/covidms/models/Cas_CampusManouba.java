package com.example.covidms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cas_CampusManouba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer nombre_cas;

    private String mois;

    public Cas_CampusManouba(Integer id, Integer nombre_cas, String mois) {
        this.id = id;
        this.nombre_cas = nombre_cas;
        this.mois = mois;
    }

    public Cas_CampusManouba() {
    }

    public Integer getId() {
        return id;
    }


    public Integer getNombre_cas() {
        return nombre_cas;
    }

    public String getMois() {
        return mois;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setNombre_cas(Integer nombre_cas) {
        this.nombre_cas = nombre_cas;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }
}
