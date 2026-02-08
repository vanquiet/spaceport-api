package com.spaceport.spaceportapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ships")
public class Ship extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int capacity;

    public Ship() {}

    public Ship(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getType() {
        return "SHIP";
    }
}

