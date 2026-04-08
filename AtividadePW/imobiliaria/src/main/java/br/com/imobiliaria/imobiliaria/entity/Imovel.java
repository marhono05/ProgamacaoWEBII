package br.com.imobiliaria.imobiliaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)
public class Imovel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImovel;
    
    @Column(nullable = false, length = 15)
    private Double valor;

    @Column(nullable = false, length = 15)
    private Double areaTotal;
    
    @Column(nullable = false, length = 15)
    private Double areaTotalConstruida;
    
    @Column(nullable = false, length = 30)
    private String cidade;
    
    @Column(nullable = false, length = 30)
    private String estado;
    
    @Column(nullable = false, length = 8)
    private String cep;
    
    @Column(nullable = false, length = 8)
    private Double latitude;
    
    @Column(nullable = false, length = 8)
    private Double longitude;

}
