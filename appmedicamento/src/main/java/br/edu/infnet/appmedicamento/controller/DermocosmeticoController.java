package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;

@Controller
public class DermocosmeticoController {

	private static List<Dermocosmetico> dermocosmeticos = new ArrayList<Dermocosmetico>();
	
	public static void incluir(Dermocosmetico dermocosmetico) {
		dermocosmeticos.add(dermocosmetico);
	}
	
	@GetMapping(value = "/dermocosmetico/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", dermocosmeticos);
		
		return "dermocosmetico/lista";
	}
}
