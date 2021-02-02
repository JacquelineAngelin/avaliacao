package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "TB_MODULO")
@Data
public class ModuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger idModulo;

    @Column(name = "DS_NOME")
    private String dsNome;

    @Column(name = "ID_INSTRUTOR")
    private BigInteger idInstrutor;


}
