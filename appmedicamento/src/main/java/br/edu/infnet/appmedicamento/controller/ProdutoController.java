package br.edu.infnet.appmedicamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appmedicamento.model.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", produtoService.obterLista());
		
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		produtoService.excluir(id);
		return "redirect:/produto/lista";
	}	
}
