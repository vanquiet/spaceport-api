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
    public List<Ship> getAll() {
        return service.getAllShips();
    }

    @GetMapping("/{id}")
    public Ship getById(@PathVariable int id) {
        return service.getShipById(id);
    }

    @PostMapping
    public Ship create(@RequestBody Ship ship) {
        return service.createShip(ship);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteShip(id);
    }
}
