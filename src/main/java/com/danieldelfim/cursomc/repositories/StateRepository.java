package com.danieldelfim.cursomc.repositories;

import com.danieldelfim.cursomc.entities.State;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{
    
}
