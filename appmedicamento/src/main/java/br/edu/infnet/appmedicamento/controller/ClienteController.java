package br.edu.infnet.appmedicamento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Cliente;


@Controller
public class ClienteController {

	private static Map<Integer, Cliente> mapa = new HashMap<Integer,Cliente>();
	
	private static Integer id = 1;	

	
	public static void incluir(Cliente cliente) {
		cliente.setId(id++);
		mapa.put(cliente.getId(), cliente);
	}
	
	public static Collection<Cliente> obterLista() {
		return mapa.values();
	}	
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "cliente/lista";
	}
}
