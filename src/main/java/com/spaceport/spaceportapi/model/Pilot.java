package com.spaceport.spaceportapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String license;

    // ОБЯЗАТЕЛЬНО для JPA
    public Pilot() {
    }

    // ИСПОЛЬЗУЕМ ТОЛЬКО ЕГО
    public Pilot(String name, String license) {
        this.name = name;
        this.license = license;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
