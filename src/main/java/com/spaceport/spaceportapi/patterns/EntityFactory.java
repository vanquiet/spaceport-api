package com.spaceport.spaceportapi.patterns;

import com.spaceport.spaceportapi.model.BaseEntity;
import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.model.Ship;

public class EntityFactory {

    public static BaseEntity create(String type) {
        return switch (type.toUpperCase()) {
            case "PILOT" -> new Pilot();
            case "SHIP" -> new Ship();
            default -> throw new IllegalArgumentException("Unknown entity type: " + type);
        };
    }
}
