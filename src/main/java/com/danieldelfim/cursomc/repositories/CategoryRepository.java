package com.danieldelfim.cursomc.repositories;

import com.danieldelfim.cursomc.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
