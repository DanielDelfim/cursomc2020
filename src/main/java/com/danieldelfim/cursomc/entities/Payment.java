package com.danieldelfim.cursomc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.danieldelfim.cursomc.entities.enums.PaymentStatus;


import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer id;
    private PaymentStatus sPaymentStatus;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    @MapsId
    private Pedido pedido;

    public Payment(){
        
    }

}
