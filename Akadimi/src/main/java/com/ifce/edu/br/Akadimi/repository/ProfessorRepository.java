package com.ifce.edu.br.Akadimi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifce.edu.br.Akadimi.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	Optional<Professor> findByNome(String nome);
	
}
