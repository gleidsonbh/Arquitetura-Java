package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;

@Controller
public class DermocosmeticoController {

	@GetMapping(value = "/dermocosmetico/lista")
	public String telaLista(Model model) {
		
		List<Dermocosmetico> dermocosmeticos = new ArrayList<Dermocosmetico>();
		
		Dermocosmetico d1 = new Dermocosmetico();		
		d1.setDescricao("Effaclar Concentrado La Roche Posay Sabonete em Barra 70g e Ganhe Gel Concentrado 40g");
		d1.setValor(39.69f);
		d1.setFabricante("La Roche-Posay");
		d1.setAvaliacao(4.9f);
		d1.setCategoria("Limpeza Facial");
		d1.setModoDeUsar("Aplique sobre o rosto úmido uma quantidade equivalente a uma moeda de 1 real, massageando suavemente");
		dermocosmeticos.add(d1);
		
		Dermocosmetico d2 = new Dermocosmetico();
		d2.setDescricao("Kit Hidratante Corporal Fisiogel A.I. Ação Calmante 2 unidades 400ml");
		d2.setValor(245.99f);
		d2.setFabricante("Stiefel");
		d2.setAvaliacao(4.8f);
		d2.setCategoria("Hidratante Corporal");
		d2.setModoDeUsar("Aplique generosamente sempre que necessário, ou conforme orientação médica.");
		dermocosmeticos.add(d2);
		
		Dermocosmetico d3 = new Dermocosmetico();
		d3.setDescricao("Hidratante para os Pés Isdin Ureadin Podos 75ml");
		d3.setValor(77.19f);
		d3.setFabricante("Medley");
		d3.setAvaliacao(4.5f);
		d3.setCategoria("Mãos e Pés");
		d3.setModoDeUsar("Aplicar uma ou duas vezes ao dia sobre a pele seca.");
		dermocosmeticos.add(d3);
		
		model.addAttribute("listagem", dermocosmeticos);
		
		return "dermocosmetico/lista";
	}
}
