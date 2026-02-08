package com.spaceport.spaceportapi.repository;

import com.spaceport.spaceportapi.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Integer> {
}
