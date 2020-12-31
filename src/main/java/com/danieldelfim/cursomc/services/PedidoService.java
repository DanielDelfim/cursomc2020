package com.danieldelfim.cursomc.services;

import java.util.Optional;

import com.danieldelfim.cursomc.entities.Pedido;
import com.danieldelfim.cursomc.exceptions.ObjectNotFoundException;
import com.danieldelfim.cursomc.repositories.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }

}
