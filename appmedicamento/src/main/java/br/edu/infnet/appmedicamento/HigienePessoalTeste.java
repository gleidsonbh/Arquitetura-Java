package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.controller.HigienePessoalController;
import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;

@Component
public class HigienePessoalTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		HigienePessoal h1 = new HigienePessoal();	
		h1.setDescricao("Solução Bucal Colgate Plax Kids com Flúor sem Álcool Tutti-Frutti com 250ml");
		h1.setFabricante("Colgate-Palmolive");
		h1.setValor(18.39f);		
		h1.setGenero("Unisex");
		h1.setPerfil("Infantil");
		h1.setPrecaucoes("Lavar as mãos antes e após o procedimento.");
		System.out.println("Higiene Pessoal - " + h1);
		HigienePessoalController.incluir(h1);
		
		HigienePessoal h2 = new HigienePessoal();
		h2.setDescricao("Desodorante Herbíssimo Tradicional Creme Antiperspirante 48h com 55g");
		h2.setFabricante("Dana");
		h2.setValor(6.29f);		
		h2.setGenero("Masculino");
		h2.setPerfil("Adulto");
		h2.setPrecaucoes("Realize o Teste de sensibilidade sempre antes da utilização do produto.");
		System.out.println("Higiene Pessoal - " + h2);
		HigienePessoalController.incluir(h2);
		
		HigienePessoal h3 = new HigienePessoal();
		h3.setDescricao("Desodorante Íntimo Daxx Higi Íntima Powder 100ml");
		h3.setFabricante("Daxx");
		h3.setValor(37.99f);		
		h3.setGenero("Feminino");
		h3.setPerfil("Adulto");
		h3.setPrecaucoes("Este produto pode ser utilizado durante a gravidez desde que sob orientação médica ou odontológica.");
		System.out.println("Higiene Pessoal - " + h3);
		HigienePessoalController.incluir(h3);
		
	}
}
