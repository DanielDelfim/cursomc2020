package com.danieldelfim.cursomc.services;

import java.util.Optional;

import com.danieldelfim.cursomc.entities.Category;
import com.danieldelfim.cursomc.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repo;

    public Category find(Integer id) {
        Optional<Category> obj = repo.findById(id);
        return obj.orElse(null);
        }
}
