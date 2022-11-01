package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;
import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;
import br.edu.infnet.appmedicamento.model.domain.Medicamento;

@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Medicamento m1 = new Medicamento();
		m1.setDescricao("Pantoprazol 40mg Medley Genérico com 42 Comprimidos Revestidos");
		m1.setFabricante("Medley");
		m1.setValor(14.99f);
		m1.setComposicao("PANTOPRAZOL SÓDICO SESQUIIDRATADO (40MG)");
		m1.setIndicacao("Alívio dos sintomas por problemas no estômago");
		m1.setRms("1.8326.0187.009-8");
		System.out.println("Medicamento - " + m1);
		
		HigienePessoal h2 = new HigienePessoal();
		h2.setDescricao("Desodorante Herbíssimo Tradicional Creme Antiperspirante 48h com 55g");
		h2.setFabricante("Dana");
		h2.setValor(6.29f);
		h2.setGenero("Masculino");
		h2.setPerfil("Adulto");
		h2.setPrecaucoes("Realize o Teste de sensibilidade sempre antes da utilização do produto.");
		System.out.println("Higiene Pessoal - " + h2);
		
		Dermocosmetico d3 = new Dermocosmetico();
		d3.setDescricao("Hidratante para os Pés Isdin Ureadin Podos 75ml");
		d3.setFabricante("Medley");
		d3.setValor(77.19f);
		d3.setAvaliacao(4.5f);
		d3.setCategoria("Mãos e Pés");
		d3.setModoDeUsar("Aplicar uma ou duas vezes ao dia sobre a pele seca.");
		System.out.println("Dermocosmético - " + d3);		
		
	}

}
