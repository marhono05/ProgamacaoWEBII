package br.com.imobiliaria.imobiliaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Residencias extends Imovel{
    
    @Column(nullable = false, unique = true)
    private Long idResidencias;
    
    @Column(nullable = false, length = 2)
    private Integer quartos;
    
    @Column(nullable = false, length = 2)
    private Integer suites;

    @Column(nullable = false, length = 2)
    private Integer banheiros;

    @Column(nullable = false, length = 3)
    private Integer vagasGaragem;

}
