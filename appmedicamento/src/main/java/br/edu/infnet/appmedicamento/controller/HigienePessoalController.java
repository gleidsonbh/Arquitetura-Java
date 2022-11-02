package br.edu.infnet.appmedicamento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;

@Controller
public class HigienePessoalController {

	private static Map<Integer, HigienePessoal> mapa = new HashMap<Integer,HigienePessoal>();
	
	private static Integer id = 1;	

	
	public static void incluir(HigienePessoal higienePessoal) {
		higienePessoal.setId(id++);
		mapa.put(higienePessoal.getId(), higienePessoal);
	}
	
	public static Collection<HigienePessoal> obterLista() {
		return mapa.values();
	}	
	
	@GetMapping(value = "/higienepessoal/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", obterLista());
		
		return "higienepessoal/lista";
	}
}
