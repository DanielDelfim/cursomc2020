package com.danieldelfim.cursomc.repositories;

import java.util.ArrayList;
import java.util.List;

import com.danieldelfim.cursomc.entities.Category;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categories")
public class CategoryRepository {
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Category>  list(){
        Category cat = new Category("informática");
        Category cat1 = new Category("Escritório");

        List<Category> listCategory = new ArrayList<>();
        listCategory.add(cat);
        listCategory.add(cat1);
        //List é uma interface e por isso não pode ser instanciado.
        //O Arraylist implementa esta interface.

        return listCategory;
    }
}
