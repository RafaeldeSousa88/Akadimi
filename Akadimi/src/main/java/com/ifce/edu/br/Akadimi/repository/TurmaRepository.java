package com.ifce.edu.br.Akadimi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifce.edu.br.Akadimi.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	Optional<Turma> findByNomeTurma(String nome);
}
	

