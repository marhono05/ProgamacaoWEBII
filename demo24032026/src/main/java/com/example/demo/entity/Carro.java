package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter


public class Carro extends Veiculo{
    private int id;
    private boolean conversivel;
    private double litrosportamalas;

}
