package br.edu.infnet.appmedicamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;

@Controller
public class HigienePessoalController {

	@GetMapping(value = "/higienepessoal/lista")
	public String telaLista(Model model) {
		
		List<HigienePessoal> higienes = new ArrayList<HigienePessoal>();
		
		HigienePessoal h1 = new HigienePessoal();	
		h1.setDescricao("Solução Bucal Colgate Plax Kids com Flúor sem Álcool Tutti-Frutti com 250ml");
		h1.setFabricante("Colgate-Palmolive");
		h1.setValor(18.39f);		
		h1.setGenero("Unisex");
		h1.setPerfil("Infantil");
		h1.setPrecaucoes("Lavar as mãos antes e após o procedimento.");
		higienes.add(h1);
		
		HigienePessoal h2 = new HigienePessoal();
		h2.setDescricao("Desodorante Herbíssimo Tradicional Creme Antiperspirante 48h com 55g");
		h2.setFabricante("Dana");
		h2.setValor(6.29f);		
		h2.setGenero("Masculino");
		h2.setPerfil("Adulto");
		h2.setPrecaucoes("Realize o Teste de sensibilidade sempre antes da utilização do produto.");
		higienes.add(h2);
		
		HigienePessoal h3 = new HigienePessoal();
		h3.setDescricao("Desodorante Íntimo Daxx Higi Íntima Powder 100ml");
		h3.setFabricante("Daxx");
		h3.setValor(37.99f);		
		h3.setGenero("Feminino");
		h3.setPerfil("Adulto");
		h3.setPrecaucoes("Este produto pode ser utilizado durante a gravidez desde que sob orientação médica ou odontológica.");
		higienes.add(h3);
		
		model.addAttribute("listagem", higienes);
		
		return "higienepessoal/lista";
	}
}
