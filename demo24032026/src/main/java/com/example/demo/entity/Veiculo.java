package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)
@Table(name="Veiculo")
@Getter
@Setter
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_veiculo",nullable = false, unique = true)
    private long id_veiculo;
    private long Renavam;
    private String Motor;
    private long CRLV;
    private String PLaca;
    private boolean transmissaoautomatica;
}
