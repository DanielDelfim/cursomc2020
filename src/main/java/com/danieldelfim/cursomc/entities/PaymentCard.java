package com.danieldelfim.cursomc.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PaymentCard extends Payment {
    private static final long serialVersionUID = 1L;

    private Integer numberCardParcels;

    public PaymentCard() {
    }
    
}
