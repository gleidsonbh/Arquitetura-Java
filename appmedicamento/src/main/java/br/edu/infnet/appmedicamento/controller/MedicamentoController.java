package br.edu.infnet.appmedicamento.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Medicamento;

@Controller
public class MedicamentoController {

	private static Map<Integer, Medicamento> mapa = new HashMap<Integer,Medicamento>();
	
	private static Integer id = 1;	
	
	public static void incluir(Medicamento medicamento) {
		medicamento.setId(id++);
		mapa.put(medicamento.getId(), medicamento);
	}
	
	public static Collection<Medicamento> obterLista() {
		return mapa.values();
	}
	
	@GetMapping(value = "/medicamento/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "medicamento/lista";
	}
}
