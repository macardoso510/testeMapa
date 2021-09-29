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
	
	@GetMapping("/error/erroConsulta")
	public String erroConsulta() {
		return "/error/erroConsulta";
	}
}

