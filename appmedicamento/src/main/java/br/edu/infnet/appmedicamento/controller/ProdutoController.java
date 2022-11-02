package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.infnet.appmedicamento.model.domain.Produto;

@Controller
public class ProdutoController {

	private static List<Produto> produtos = new ArrayList<Produto>();
	
	public static void incluir(Produto produto) {
		produtos.add(produto);
	}
	
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", produtos);
		
		return "produto/lista";
	}
}
