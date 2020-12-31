package com.danieldelfim.cursomc.entities;

import java.util.Date;
import javax.persistence.Entity;
import com.danieldelfim.cursomc.entities.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PaymentBillet extends Payment {
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dueDate;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date paymentDate;

    public PaymentBillet() {
    }

}
