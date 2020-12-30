package com.danieldelfim.cursomc.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.danieldelfim.cursomc.entities.enums.ClientType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Client implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String cpf_Cnpj;
    private Integer type;

    @OneToMany(mappedBy = "client")
    private List<Address> addresses = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "phones")
    private Set<String> phones = new HashSet<>();

    public Client(Integer id, String name, String email, String cpf_Cnpj, ClientType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf_Cnpj = cpf_Cnpj;
        this.type = type.getCode();
    }

    public ClientType getType(){
        return ClientType.toEnum(type);
    }

    public void setType(ClientType type){
        this.type = type.getCode();
    }
           
}
