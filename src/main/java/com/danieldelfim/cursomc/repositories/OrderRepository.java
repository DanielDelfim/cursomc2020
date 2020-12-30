package com.danieldelfim.cursomc.repositories;

import com.danieldelfim.cursomc.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
