package com.example.organizador.domain.Conta;

import java.util.Date;

import com.example.organizador.domain.Categoria.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "organizador")
public class Conta {
    
    @EmbeddedId
    private ContaId id;

    @Column(name="img_boleto_irl")
    private String imgBoletoIrl;

    @Column(name="img_recibo_irl")
    private String imgReciboIrl;

    @Column(name ="data_pagamento")
    private Date dataPagamento;

    //categoria que a conta pertence
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
