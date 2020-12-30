package com.danieldelfim.cursomc.entities;

import javax.persistence.Entity;

import com.danieldelfim.cursomc.entities.enums.PaymentStatus;

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

    public PaymentCard(Integer id, PaymentStatus sPaymentStatus, Order order, Integer numberCardParcels) {
        super(id, sPaymentStatus, order);
        this.numberCardParcels = numberCardParcels;
    }
    
}
