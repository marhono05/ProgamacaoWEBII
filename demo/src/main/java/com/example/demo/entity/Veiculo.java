package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVeiculo;
    private Long renavamVeiculo;
    private String motorVeiculo;
    private long crlvVeiculo;
    private String placaVeiculo;
    private boolean transmissaoautoVeiculo;


    
}
