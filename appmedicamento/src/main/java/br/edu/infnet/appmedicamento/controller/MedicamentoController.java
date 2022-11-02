package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Medicamento;

@Controller
public class MedicamentoController {

	private static List<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
	public static void incluir(Medicamento medicamento) {
		medicamentos.add(medicamento);
	}
	
	@GetMapping(value = "/medicamento/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", medicamentos);
		
		return "medicamento/lista";
	}
}
