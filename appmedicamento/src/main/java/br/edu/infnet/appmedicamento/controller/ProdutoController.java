package br.edu.infnet.appmedicamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

	@GetMapping(value = "/produto/lista")
	public String telaLista() {
		return "produto/lista";
	}
}
