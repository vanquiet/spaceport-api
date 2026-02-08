package com.spaceport.spaceportapi.patterns;

import com.spaceport.spaceportapi.model.*;

public class EntityFactory {

    public static BaseEntity create(String type, String... args) {

        return switch (type.toUpperCase()) {
            case "PILOT" -> new Pilot(args[0], args[1]);
            case "SHIP" -> new Ship(args[0], Integer.parseInt(args[1]));
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}

