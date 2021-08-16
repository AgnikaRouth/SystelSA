package com.example.otakudb.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Arrays;

@Data
@Entity
@Table(name = "artiste")
public class artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nom", length = 50)
    private String nom;
    @Column(name = "prenom", length = 50)
    private String prenom;
    @Column(name = "alias", length = 50)
    private String alias;
    @Column(name = "presentation")
    private String presentation;

    @Lob
    @Column(name = "image_b64", length = 1000)
    private byte[] image_b64;

    public artiste() {
        super();

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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public byte[] getImage_b64() {
        return image_b64;
    }

    public void setImage_b64(byte[] image_b64) {
        this.image_b64 = image_b64;
    }

    @Override
    public String toString() {
        return "Artist [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", alias=" + alias+ ", presentation =" + presentation + ", image="
                + Arrays.toString(image_b64) + "]";
    }
}

