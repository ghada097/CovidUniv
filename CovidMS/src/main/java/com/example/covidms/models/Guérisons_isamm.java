package com.example.covidms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guérisons_isamm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer nombre_guérisons;

    private String mois;

    public Guérisons_isamm(Integer id, Integer nombre_guérisons, String mois) {
        this.id = id;
        this.nombre_guérisons = nombre_guérisons;
        this.mois = mois;
    }

    public Guérisons_isamm() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getNombre_guérisons() {
        return nombre_guérisons;
    }

    public String getMois() {
        return mois;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre_guérisons(Integer nombre_guérisons) {
        this.nombre_guérisons = nombre_guérisons;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }
}
