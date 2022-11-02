package br.edu.infnet.appmedicamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appmedicamento.model.domain.Cliente;
import br.edu.infnet.appmedicamento.model.service.ClienteService;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cliente c1 = new Cliente();
		c1.setNome("Cliente 1");
		c1.setIdade(27);
		c1.setCidade("Itaúna - MG");
		System.out.println("Cliente: " + c1);
		clienteService.incluir(c1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Cliente 2");
		c2.setIdade(30);
		c2.setCidade("Belo Horizonte - MG");
		System.out.println("Cliente: " + c2);
		clienteService.incluir(c2);
		
		Cliente c3 = new Cliente();
		c3.setNome("Cliente 3");
		c3.setIdade(50);
		c3.setCidade("Contagem - MG");
		System.out.println("Cliente: " + c3);
		clienteService.incluir(c3);
	}	
	
}
