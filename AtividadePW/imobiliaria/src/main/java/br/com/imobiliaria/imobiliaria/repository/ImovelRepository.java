package br.com.imobiliaria.imobiliaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobiliaria.imobiliaria.entity.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
    List<Imovel> findByValorBetween(Double valor1, Double valor2);
    List<Imovel> findByCidadeLike(String cidade);
}