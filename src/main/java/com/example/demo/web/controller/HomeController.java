package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "/home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	

	@GetMapping("/logado")
	public String logado() {
		return "/logado";
	}
	
	@GetMapping("/consultaAutenticidade")
	public String consultaAutenticidade() {
		return "/consultaAutenticidade";

	}
	
	
	@GetMapping("/homeLogado")
	public String homeLogado() {
		return "/homeLogado";
	}
	
	@GetMapping("/cadastro")
	public String casdatro() {
		return "/cadastro";
	}
	
	@GetMapping("/ingredienteAtivo")
	public String ingredienteAtivo() {
		return "/ingredienteAtivo";
	}
	
	@GetMapping("/ingrediente")
	public String ingrediente() {
		return "/ingrediente";
	}
	
	@GetMapping("/garantiaMateriaPrima")
	public String garantiaMateriaPrima() {
		return "/garantiaMateriaPrima";
	}
	
	@GetMapping("/restringirHabilitacao")
	public String restringirHabilitacao() {
		return "/restringirHabilitacao";
	}
	
	@GetMapping("/error/erroConsulta")
	public String erroConsulta() {
		return "/error/erroConsulta";
	}
}

