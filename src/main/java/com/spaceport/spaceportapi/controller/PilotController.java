package com.spaceport.spaceportapi.controller;

import com.spaceport.spaceportapi.dto.PilotCreateDto;
import com.spaceport.spaceportapi.dto.PilotUpdateDto;
import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.service.PilotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PilotController {

    private final PilotService service;

    public PilotController(PilotService service) {
        this.service = service;
    }

    @GetMapping("/pilots")
    public List<Pilot> getAll() {
        return service.getAll();
    }

    @PostMapping("/pilots")
    public Pilot create(@RequestBody PilotCreateDto dto) {
        return service.create(dto);
    }

    @PutMapping("/pilots/{id}")
    public Map<String, Object> update(@PathVariable int id, @RequestBody PilotUpdateDto dto) {
        service.updateName(id, dto);
        return Map.of("status", "updated");
    }

    @DeleteMapping("/pilots/{id}")
    public Map<String, Object> delete(@PathVariable int id) {
        service.delete(id);
        return Map.of("status", "deleted");
    }
}
