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

    @PostMapping
    public Pilot create(@RequestBody Pilot pilot) {
        return service.create(pilot);
    }
}
