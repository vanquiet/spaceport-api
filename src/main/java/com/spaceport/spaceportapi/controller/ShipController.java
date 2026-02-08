package com.spaceport.spaceportapi.controller;

import com.spaceport.spaceportapi.model.Ship;
import com.spaceport.spaceportapi.service.ShipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ships")
public class ShipController {

    private final ShipService service;

    public ShipController(ShipService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ship> getShips() {
        return service.getAll();
    }
}
