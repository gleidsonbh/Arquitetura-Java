package br.edu.infnet.appmedicamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicamentoController {

	@GetMapping(value = "/medicamento/lista")
	public String telaLista() {
		return "medicamento/lista";
	}
}
