package com.ifce.edu.br.Akadimi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.edu.br.Akadimi.model.Estudante;
import com.ifce.edu.br.Akadimi.service.EstudanteService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/estudante")
public class EstudanteController {
	
	@Autowired
	private EstudanteService estudanteService;
	
	@GetMapping("/cadastro")
	public ModelAndView cadastro(Estudante estudante) {
		return null;
	}
	
	@PostMapping
	public ModelAndView salvar(@Valid Estudante estudante) {
		return null;
	}
	
	@GetMapping
	public ModelAndView editar(Estudante estudante) {
		return null;
	}
	
	@GetMapping
	public ModelAndView pesquisar() {
		return null;
	}
	
	@DeleteMapping
	public String deletar() {
		return null;
	}

}
