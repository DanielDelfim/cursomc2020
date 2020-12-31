package com.danieldelfim.cursomc.entities;

import java.util.Date;
import javax.persistence.Entity;

import com.danieldelfim.cursomc.entities.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PaymentBillet extends Payment {
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dueDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date paymentDate;

    public PaymentBillet() {
    }

    public PaymentBillet(Integer id, PaymentStatus sPaymentStatus, Pedido pedido, Date dueDate, Date paymentDate) {
        super(id, sPaymentStatus, pedido);
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
    }

    public Date getdueDate() {
		return dueDate;
	}

	public void setdueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}	
	

}
