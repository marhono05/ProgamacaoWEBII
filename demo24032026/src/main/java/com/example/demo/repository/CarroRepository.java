package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Carro;
import com.example.demo.entity.Veiculo;


@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {


}
