package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;

@Component
public class HigienePessoalTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		HigienePessoal h1 = new HigienePessoal();		
		h1.genero = "Unisex";
		h1.perfil = "Infantil";
		h1.precaucoes = "Lavar as mãos antes e após o procedimento.";
		System.out.println("Medicamento - " + h1);
		
		HigienePessoal h2 = new HigienePessoal();
		h2.genero = "Masculino";
		h2.perfil = "Adulto";
		h2.precaucoes = "Realize o Teste de sensibilidade sempre antes da utilização do produto.";
		System.out.println("Medicamento - " + h2);
		
		HigienePessoal h3 = new HigienePessoal();
		h3.genero = "Feminino";
		h3.perfil = "Adulto";
		h3.precaucoes = "Este medicamento pode ser utilizado durante a gravidez desde que sob orientação médica ou odontológica.";
		System.out.println("Medicamento - " + h3);
		
	}
}
