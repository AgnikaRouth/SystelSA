package com.example.otakudb.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fan")
public class fan {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="ville")
    private String ville;
    @Column(name="pays")
    private String pays;

    public fan() {

    }

    public fan(String nom, String prenom, String ville, String pays) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.pays= pays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}


