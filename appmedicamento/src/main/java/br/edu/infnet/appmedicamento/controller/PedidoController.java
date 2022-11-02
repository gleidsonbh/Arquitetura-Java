package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Pedido;

@Controller
public class PedidoController {

	private static List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public static void incluir(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", pedidos);
		
		return "pedido/lista";
	}
}
