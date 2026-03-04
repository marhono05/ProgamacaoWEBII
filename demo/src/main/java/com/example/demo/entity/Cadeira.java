package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cadeira")
public class Cadeira {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCadeira;
    private String materialCadeira;
    private double alturaCadeira;
    private boolean reclinavelCadeira;
    private boolean giraCadeira;
    private boolean estofadoCadeira;
    private boolean encostoCadeira;

}