package com.example.organizador.domain.Conta;

import java.io.Serializable;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class ContaId implements Serializable{

    @Column(name="nome")
    private String nome; 

    @Column(name="mes")
    private int mes;

    @Column(name="ano")
    private int ano;

    @Column(name="parcela")
    private int parcela;
    
    
}
