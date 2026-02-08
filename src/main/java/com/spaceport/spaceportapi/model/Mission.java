package com.spaceport.spaceportapi.model;

public class Mission {

    private String title;
    private String destination;
    private Integer durationDays;
    private String cargo;

    // PUBLIC constructor (нужно для Builder из другого пакета)
    public Mission(String title, String destination, Integer durationDays, String cargo) {
        this.title = title;
        this.destination = destination;
        this.durationDays = durationDays;
        this.cargo = cargo;
    }

    public String getTitle() {
        return title;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getDurationDays() {
        return durationDays;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "title='" + title + '\'' +
                ", destination='" + destination + '\'' +
                ", durationDays=" + durationDays +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
