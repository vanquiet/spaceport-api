package com.spaceport.spaceportapi.model;

public class Ship extends BaseEntity {
    private String name;

    public Ship() {}
    public Ship(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getType() { return "SHIP"; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
