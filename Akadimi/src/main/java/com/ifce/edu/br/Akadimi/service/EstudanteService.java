package com.ifce.edu.br.Akadimi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.edu.br.Akadimi.model.Estudante;
import com.ifce.edu.br.Akadimi.repository.EstudanteRepository;

@Service
public class EstudanteService {
	
	@Autowired
	private EstudanteRepository estudantesR;
	
	public List<Estudante> buscarTodos() {
		return estudantesR.findAll();
	}

}
