package com.danieldelfim.cursomc.services;

import java.util.Optional;

import com.danieldelfim.cursomc.entities.Client;
import com.danieldelfim.cursomc.exceptions.ObjectNotFoundException;
import com.danieldelfim.cursomc.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repo;

    public Client find(Integer id) {
        Optional<Client> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Client.class.getName()));
    }

}
