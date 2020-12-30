package com.danieldelfim.cursomc.services;

import java.util.Optional;

import com.danieldelfim.cursomc.entities.Order;
import com.danieldelfim.cursomc.exceptions.ObjectNotFoundException;
import com.danieldelfim.cursomc.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repo;

    public Order find(Integer id) {
        Optional<Order> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Order.class.getName()));
    }

}
