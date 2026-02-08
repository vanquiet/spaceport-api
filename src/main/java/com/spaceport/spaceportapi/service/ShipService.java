package com.spaceport.spaceportapi.service;

import com.spaceport.spaceportapi.model.Ship;
import com.spaceport.spaceportapi.repository.ShipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {

    private final ShipRepository repository;

    public ShipService(ShipRepository repository) {
        this.repository = repository;
    }

    public List<Ship> getAllShips() {
        return repository.findAll();
    }

    public Ship getShipById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ship not found"));
    }

    public Ship createShip(Ship ship) {


        return repository.save(ship);
    }

    public void deleteShip(int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Ship not found");
        }
        repository.deleteById(id);
    }
}
