package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Cadeira")
public class Cadeira {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Double altura;
    private String cor;
    private String material;
    private boolean reclinavel;
    private boolean estofado;
    private boolean gira;
    private boolean Encosto;
}
