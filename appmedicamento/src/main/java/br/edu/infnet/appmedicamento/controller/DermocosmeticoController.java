package br.edu.infnet.appmedicamento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;


@Controller
public class DermocosmeticoController {

	private static Map<Integer, Dermocosmetico> mapa = new HashMap<Integer,Dermocosmetico>();
	
	private static Integer id = 1;	

	
	public static void incluir(Dermocosmetico dermocosmetico) {
		dermocosmetico.setId(id++);
		mapa.put(dermocosmetico.getId(), dermocosmetico);
	}
	
	public static Collection<Dermocosmetico> obterLista() {
		return mapa.values();
	}	
	
	@GetMapping(value = "/dermocosmetico/lista")
	public String telaLista(Model model) {
				
		model.addAttribute("listagem", obterLista());
		
		return "dermocosmetico/lista";
	}
}
