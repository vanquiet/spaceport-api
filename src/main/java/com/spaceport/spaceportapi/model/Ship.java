package com.spaceport.spaceportapi.model;

import jakarta.persistence.Entity;

@Entity
public class Ship extends BaseEntity {

    private String model;
    private int capacity;

    public Ship() {}

    public Ship(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String getType() {
        return "SHIP";
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}

