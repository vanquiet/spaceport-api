package com.spaceport.spaceportapi.service;

import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.repository.PilotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {

    private final PilotRepository repository;

    public PilotService(PilotRepository repository) {
        this.repository = repository;
    }

    public List<Pilot> getAll() {
        return repository.findAll();
    }

    public Pilot save(Pilot pilot) {
        return repository.save(pilot);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
