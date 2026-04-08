package br.com.imobiliaria.imobiliaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comerciais extends Imovel{
    
    @Column(nullable = false, unique = true)
    private Long idComerciais;
    
    @Column(nullable = false, length = 3)
    private Integer salas;
    
    @Column(nullable = false, length = 3)
    private Integer banheiros;
}
