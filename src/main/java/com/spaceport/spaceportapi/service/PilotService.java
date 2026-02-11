package com.spaceport.spaceportapi.service;

import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.repository.PilotRepository;
import com.spaceport.spaceportapi.utils.CacheManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {

    private final PilotRepository repository;
    private final CacheManager cache = CacheManager.getInstance();

    public PilotService(PilotRepository repository) {
        this.repository = repository;
    }

    public List<Pilot> getAll() {

        Object cached = cache.get("pilots");

        if (cached != null) {
            return (List<Pilot>) cached;
        }

        List<Pilot> pilots = repository.findAll();
        cache.put("pilots", pilots);

        return pilots;
    }

    public Pilot getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Pilot create(Pilot pilot) {
        Pilot saved = repository.save(pilot);
        cache.remove("pilots");
        return saved;
    }

    public Pilot update(Long id, Pilot pilot) {
        Pilot existing = repository.findById(id).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setName(pilot.getName());
        existing.setLicense(pilot.getLicense());

        Pilot updated = repository.save(existing);
        cache.remove("pilots");

        return updated;
    }

    public void delete(Long id) {
        repository.deleteById(id);
        cache.remove("pilots");
    }
}
