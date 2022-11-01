package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente c1 = new Cliente();
		c1.nome = "Cliente 1";
		c1.idade = 27;
		c1.cidade = "Itaúna - MG";
		System.out.println("Cliente: " + c1);
		
		Cliente c2 = new Cliente();
		c2.nome = "Cliente 2";
		c2.idade = 30;
		c2.cidade = "Belo Horizonte - MG";
		System.out.println("Cliente: " + c2);
		
		Cliente c3 = new Cliente();
		c3.nome = "Cliente 3";
		c3.idade = 50;
		c3.cidade = "Contagem - MG";
		System.out.println("Cliente: " + c3);
	}	
	
}
