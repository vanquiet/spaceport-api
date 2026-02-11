package com.spaceport.spaceportapi.repository;

import com.spaceport.spaceportapi.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long> {
}