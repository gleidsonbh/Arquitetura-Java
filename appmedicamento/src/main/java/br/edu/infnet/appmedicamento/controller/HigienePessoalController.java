package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;

@Controller
public class HigienePessoalController {

	private static List<HigienePessoal> higienes = new ArrayList<HigienePessoal>();
	
	public static void incluir(HigienePessoal higienePessoal) {
		higienes.add(higienePessoal);
	}
	
	@GetMapping(value = "/higienepessoal/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", higienes);
		
		return "higienepessoal/lista";
	}
}
