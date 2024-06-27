package com.example.myspringbootapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("wilaya")
public class Wilaya {

    @Id
    private Integer id;

    private Boolean actif;

    @Column("compte_creation")
    private Integer compteCreation;

    @Column("compte_maj")
    private Integer compteMaj;

    @Column("date_creation")
    private LocalDateTime dateCreation;

    @Column("date_maj")
    private LocalDateTime dateMaj;

    @Column("nom_arabe")
    private String nomArabe;

    @Column("nom_latin")
    private String nomLatin;

    @Column("nom_tamazight")
    private String nomTamazight;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Integer getCompteCreation() {
        return compteCreation;
    }

    public void setCompteCreation(Integer compteCreation) {
        this.compteCreation = compteCreation;
    }

    public Integer getCompteMaj() {
        return compteMaj;
    }

    public void setCompteMaj(Integer compteMaj) {
        this.compteMaj = compteMaj;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(LocalDateTime dateMaj) {
        this.dateMaj = dateMaj;
    }

    public String getNomArabe() {
        return nomArabe;
    }

    public void setNomArabe(String nomArabe) {
        this.nomArabe = nomArabe;
    }

    public String getNomLatin() {
        return nomLatin;
    }

    public void setNomLatin(String nomLatin) {
        this.nomLatin = nomLatin;
    }

    public String getNomTamazight() {
        return nomTamazight;
    }

    public void setNomTamazight(String nomTamazight) {
        this.nomTamazight = nomTamazight;
    }
}
