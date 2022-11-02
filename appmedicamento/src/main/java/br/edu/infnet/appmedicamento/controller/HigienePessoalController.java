package br.edu.infnet.appmedicamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appmedicamento.model.service.HigienePessoalService;

@Controller
public class HigienePessoalController {

	@Autowired
	private HigienePessoalService higienePessoalService;
	
	@GetMapping(value = "/higienepessoal/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", higienePessoalService.obterLista());
		
		return "higienepessoal/lista";
	}
	
	@GetMapping(value = "/higienepessoal/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		higienePessoalService.excluir(id);
		return "redirect:/higienepessoal/lista";
	}
}
