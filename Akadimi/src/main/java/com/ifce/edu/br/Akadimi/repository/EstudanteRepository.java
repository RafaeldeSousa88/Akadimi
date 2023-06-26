package com.ifce.edu.br.Akadimi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifce.edu.br.Akadimi.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
	
	Optional<Estudante> findByMatricula(String matricula);

}