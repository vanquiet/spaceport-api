package com.spaceport.spaceportapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "license_code", nullable = false)
    private String license;

    public Pilot() {}

    public Pilot(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getLicense() { return license; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setLicense(String license) { this.license = license; }


}