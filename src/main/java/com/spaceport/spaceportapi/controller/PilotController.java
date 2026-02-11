package com.spaceport.spaceportapi.controller;

import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.service.PilotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pilots")
public class PilotController {

    private final PilotService service;

    public PilotController(PilotService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pilot> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Pilot getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Pilot create(@RequestBody Pilot pilot) {
        return service.create(pilot);
    }

    @PutMapping("/{id}")
    public Pilot update(@PathVariable Long id, @RequestBody Pilot pilot) {
        return service.update(id, pilot);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}