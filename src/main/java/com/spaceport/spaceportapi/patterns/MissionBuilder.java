package com.spaceport.spaceportapi.patterns;

import com.spaceport.spaceportapi.model.Mission;

public class MissionBuilder {
    private String title;
    private String destination;
    private Integer durationDays;
    private String cargo;

    public MissionBuilder title(String title) { this.title = title; return this; }
    public MissionBuilder destination(String destination) { this.destination = destination; return this; }
    public MissionBuilder durationDays(Integer durationDays) { this.durationDays = durationDays; return this; }
    public MissionBuilder cargo(String cargo) { this.cargo = cargo; return this; }

    public Mission build() {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title required");
        if (destination == null || destination.isBlank()) throw new IllegalArgumentException("destination required");
        return new Mission(title, destination, durationDays, cargo);
    }
}
