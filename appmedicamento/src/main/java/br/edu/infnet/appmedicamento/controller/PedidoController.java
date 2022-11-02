package br.edu.infnet.appmedicamento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Pedido;

@Controller
public class PedidoController {

	private static Map<Integer, Pedido> mapa = new HashMap<Integer,Pedido>();
	
	private static Integer id = 1;	
	
	public static void incluir(Pedido pedido) {
		pedido.setId(id++);
		mapa.put(pedido.getId(), pedido);
	}
	
	public static Collection<Pedido> obterLista() {
		return mapa.values();
	}
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", obterLista());
		
		return "pedido/lista";
	}
}
