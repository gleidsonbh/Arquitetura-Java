package br.edu.infnet.appmedicamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DermocosmeticoController {

	@GetMapping(value = "/dermocosmetico/lista")
	public String telaLista() {
		return "dermocosmetico/lista";
	}
}
