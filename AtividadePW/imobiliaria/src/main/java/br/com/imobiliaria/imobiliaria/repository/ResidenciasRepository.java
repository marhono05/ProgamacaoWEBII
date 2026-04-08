package br.com.imobiliaria.imobiliaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobiliaria.imobiliaria.entity.Residencias;

public interface ResidenciasRepository extends JpaRepository<Residencias, Long>{
    List<Residencias> findByQuartosGreaterThan(Integer quartos);
}