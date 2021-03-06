package com.danieldelfim.cursomc.repositories;

import com.danieldelfim.cursomc.entities.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
    
}
