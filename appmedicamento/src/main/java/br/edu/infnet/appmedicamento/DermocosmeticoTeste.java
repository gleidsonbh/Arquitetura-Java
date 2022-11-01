package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;

@Component
public class DermocosmeticoTeste implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Dermocosmetico d1 = new Dermocosmetico();		
		d1.avaliacao = 4.9f;
		d1.categoria = "Limpeza Facial";
		d1.modoDeUsar = "plique sobre o rosto úmido uma quantidade equivalente a uma moeda de 1 real, massageando suavemente";
		System.out.println("Medicamento - " + d1);
		
		Dermocosmetico d2 = new Dermocosmetico();
		d2.avaliacao = 4.8f;
		d2.categoria = "Hidratante Corporal";
		d2.modoDeUsar = "Aplique generosamente sempre que necessário, ou conforme orientação médica.";
		System.out.println("Medicamento - " + d2);
		
		Dermocosmetico d3 = new Dermocosmetico();
		d3.avaliacao = 4.5f;
		d3.categoria = "Mãos e Pés";
		d3.modoDeUsar = "Aplicar uma ou duas vezes ao dia sobre a pele seca.";
		System.out.println("Medicamento - " + d3);
		
	}
}
