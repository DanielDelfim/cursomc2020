// package com.danieldelfim.cursomc.entities;

// import java.io.Serializable;
// import java.util.Date;

// // import javax.persistence.CascadeType;
// import javax.persistence.Entity;
// // import javax.persistence.GeneratedValue;
// // import javax.persistence.GenerationType;
// // import javax.persistence.Id;
// // import javax.persistence.JoinColumn;
// // import javax.persistence.ManyToOne;
// // import javax.persistence.OneToOne;

// import com.fasterxml.jackson.annotation.JsonFormat;

// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor
// @Entity
// public class Order implements Serializable{
//     private static final long serialVersionUID = 1L;
    
//     // @Id 
//     // @GeneratedValue(strategy=GenerationType.IDENTITY)
//     // private Integer id;
    
//     @JsonFormat(pattern="dd/MM/yyyy HH:mm")
//     private Date instante;

//     // @OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
//     // private Payment payment;

//     // @ManyToOne
//     // @JoinColumn(name="client_id")
//     // private Client client;

//     // @ManyToOne
//     // @JoinColumn(name="delivery_Address_id")
//     // private Address deliveryAddress;

// }
