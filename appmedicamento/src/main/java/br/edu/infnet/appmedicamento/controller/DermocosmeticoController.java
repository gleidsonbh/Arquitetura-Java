package br.edu.infnet.appmedicamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appmedicamento.model.service.DermocosmeticoService;

@Controller
public class DermocosmeticoController {

	@Autowired
	private DermocosmeticoService dermocosmeticoService;
	
	@GetMapping(value = "/dermocosmetico/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", dermocosmeticoService.obterLista());
		
		return "dermocosmetico/lista";
	}
	
	@GetMapping(value = "/dermocosmetico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		dermocosmeticoService.excluir(id);
		return "redirect:/dermocosmetico/lista";
	}	
}
