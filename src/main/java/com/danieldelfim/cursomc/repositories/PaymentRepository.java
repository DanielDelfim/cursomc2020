package com.danieldelfim.cursomc.repositories;

import com.danieldelfim.cursomc.entities.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
    
}
