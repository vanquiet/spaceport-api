package com.spaceport.spaceportapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pilots")
public class Pilot extends BaseEntity {

    private String name;
    private String license;

    public Pilot() {}

    public Pilot(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
