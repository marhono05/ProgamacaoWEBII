package br.com.imobiliaria.imobiliaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.imobiliaria.imobiliaria.entity.Imovel;
import br.com.imobiliaria.imobiliaria.repository.ImovelRepository;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> buscarIntervalodePrecos(Double min, Double max) {
        if (min > max) {
            return "O valor máximo deve ser maior que o minímo";
        } else {
            return imovelRepository.findByValorBetween(min, max);
        }
    }
}

