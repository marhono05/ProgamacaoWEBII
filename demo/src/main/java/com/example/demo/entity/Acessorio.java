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
//@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)

@Entity
@Inheritance(strategy= jakarta.persistence.InheritanceType.JOINED)
@Getter
@Setter
@Table(name = "Acessorios")
public class Acessorio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_acessorios",nullable = false,unique = true)
    private long id;
    private long ean;
    private double altura;
    private double largura;
    private double profundidade;
    private double peso;

}
