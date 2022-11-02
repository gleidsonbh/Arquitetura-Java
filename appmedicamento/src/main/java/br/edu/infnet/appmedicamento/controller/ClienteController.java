package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Cliente;

@Controller
public class ClienteController {

	private static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void incluir(Cliente cliente) {
		clientes.add(cliente);
	}
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", clientes);
		
		return "cliente/lista";
	}
}
