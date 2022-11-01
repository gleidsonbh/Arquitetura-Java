package br.edu.infnet.appmedicamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HigienePessoalController {

	@GetMapping(value = "/higienepessoal/lista")
	public String telaLista() {
		return "higienepessoal/lista";
	}
}
