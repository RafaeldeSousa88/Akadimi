package com.ifce.edu.br.Akadimi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.edu.br.Akadimi.model.Professor;
import com.ifce.edu.br.Akadimi.service.ProfessorService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("/cadastro")
	public ModelAndView cadastro(Professor professor) {
		return null;
	}
	
	@PostMapping
	public ModelAndView salvar(@Valid Professor professor) {
		return null;
	}
	
	@GetMapping
	public ModelAndView editar(Professor professor) {
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
