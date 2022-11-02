package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.controller.ClienteController;
import br.edu.infnet.appmedicamento.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente c1 = new Cliente();
		c1.setNome("Cliente 1");
		c1.setIdade(27);
		c1.setCidade("Itaúna - MG");
		System.out.println("Cliente: " + c1);
		ClienteController.incluir(c1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Cliente 2");
		c2.setIdade(30);
		c2.setCidade("Belo Horizonte - MG");
		System.out.println("Cliente: " + c2);
		ClienteController.incluir(c2);
		
		Cliente c3 = new Cliente();
		c3.setNome("Cliente 3");
		c3.setIdade(50);
		c3.setCidade("Contagem - MG");
		System.out.println("Cliente: " + c3);
		ClienteController.incluir(c3);
	}	
	
}
