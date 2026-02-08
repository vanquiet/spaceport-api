package com.spaceport.spaceportapi.patterns;

import com.spaceport.spaceportapi.model.*;

public class EntityFactory {

    public static BaseEntity create(String type, int id, String name, String license) {

        return switch (type) {
            case "PILOT" -> new Pilot(id, name, license);
            default -> throw new IllegalArgumentException("Unknown entity type");
        };
    }
}
