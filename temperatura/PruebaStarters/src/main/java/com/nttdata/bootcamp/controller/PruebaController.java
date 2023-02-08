package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;
import com.nttdata.bootcamp.temperaturaconversor.Conversor;

@RestController
public class PruebaController {

	@Autowired
	private Saludo saludo;

	@Autowired
	private Conversor conversor;

	public PruebaController(Conversor conversor) {
		this.conversor = conversor;
	}

	@GetMapping("/convertir")
	public String conversor(String degree) {
		return Double.toString(conversor.convert(degree));
		
	}

	@GetMapping(path = "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return "hello World";
	}

}
