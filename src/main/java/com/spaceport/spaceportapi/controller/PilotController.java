package com.spaceport.spaceportapi.controller;

import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.repository.PilotRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilots")
public class PilotController {

    private final PilotRepository repository;

    public PilotController(PilotRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Pilot> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Pilot create(@RequestBody Pilot pilot) {
        return repository.save(pilot);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
