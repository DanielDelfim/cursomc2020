package com.danieldelfim.cursomc.entities;

import javax.persistence.Entity;

import com.danieldelfim.cursomc.entities.enums.PaymentStatus;

@Entity
public class PaymentCard extends Payment {
    private static final long serialVersionUID = 1L;

    private Integer numberCardParcels;

    public PaymentCard() {
    }

    public PaymentCard(Integer id, PaymentStatus sPaymentStatus, Pedido pedido, Integer numberCardParcels) {
        super(id, sPaymentStatus, pedido);
        this.numberCardParcels = numberCardParcels;
    }

    public Integer getnumberCardParcels() {
		return numberCardParcels;
	}

	public void setnumberCardParcels(Integer numberCardParcels) {
		this.numberCardParcels = numberCardParcels;
	}

}
