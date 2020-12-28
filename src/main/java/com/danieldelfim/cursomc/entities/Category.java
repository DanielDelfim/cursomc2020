package com.danieldelfim.cursomc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Category implements Serializable{
    private static final long serialVersionUID = 1L;

    private @Id @GeneratedValue Long id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

}
