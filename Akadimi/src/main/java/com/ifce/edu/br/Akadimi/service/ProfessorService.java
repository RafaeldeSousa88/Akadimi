package com.ifce.edu.br.Akadimi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.edu.br.Akadimi.model.Professor;
import com.ifce.edu.br.Akadimi.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professoresR;
	
	public List<Professor> buscarTodos() {
		return professoresR.findAll();
	}
}
