package com.spaceport.spaceportapi.service;

import com.spaceport.spaceportapi.dto.PilotCreateDto;
import com.spaceport.spaceportapi.dto.PilotUpdateDto;
import com.spaceport.spaceportapi.exception.BadRequestException;
import com.spaceport.spaceportapi.exception.NotFoundException;
import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.repository.PilotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {

    private final PilotRepository repo;

    public PilotService(PilotRepository repo) {
        this.repo = repo;
    }

    public List<Pilot> getAll() {
        return repo.findAll();
    }

    public Pilot create(PilotCreateDto dto) {
        if (dto == null) throw new BadRequestException("body required");
        if (dto.name == null || dto.name.isBlank()) throw new BadRequestException("name required");
        if (dto.licenseCode == null || dto.licenseCode.isBlank()) throw new BadRequestException("licenseCode required");
        return repo.create(dto.name, dto.licenseCode);
    }

    public void updateName(int id, PilotUpdateDto dto) {
        if (dto == null || dto.name == null || dto.name.isBlank()) throw new BadRequestException("name required");
        boolean ok = repo.updateName(id, dto.name);
        if (!ok) throw new NotFoundException("pilot not found: " + id);
    }

    public void delete(int id) {
        boolean ok = repo.delete(id);
        if (!ok) throw new NotFoundException("pilot not found: " + id);
    }
}
