package br.com.imobiliaria.imobiliaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobiliaria.imobiliaria.entity.Comerciais;

public interface ComerciaisRepository extends JpaRepository<Comerciais, Long>{
    List<Comerciais> findBySalasGreaterThan(Integer salas);   
}