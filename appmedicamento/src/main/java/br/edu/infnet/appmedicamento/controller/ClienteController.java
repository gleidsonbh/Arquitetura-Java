package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Cliente;

@Controller
public class ClienteController {

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Cliente 1");
		c1.setIdade(27);
		c1.setCidade("Itaúna - MG");
		clientes.add(c1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Cliente 2");
		c2.setIdade(30);
		c2.setCidade("Belo Horizonte - MG");
		clientes.add(c2);
		
		Cliente c3 = new Cliente();
		c3.setNome("Cliente 3");
		c3.setIdade(50);
		c3.setCidade("Contagem - MG");
		clientes.add(c3);
		
		model.addAttribute("listagem", clientes);
		
		return "cliente/lista";
	}
}
