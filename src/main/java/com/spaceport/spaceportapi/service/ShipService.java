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

    public List<Ship> getAll() {
        return repository.findAll();
    }
}
