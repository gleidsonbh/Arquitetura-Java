package br.edu.infnet.appmedicamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appmedicamento.model.domain.Cliente;
import br.edu.infnet.appmedicamento.model.domain.Usuario;
import br.edu.infnet.appmedicamento.model.service.ClienteService;

@Order(3)
@Component
public class ClienteTeste implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente c1 = new Cliente();
		c1.setNome("Cliente 1");
		c1.setIdade(27);
		c1.setCidade("Itaúna - MG");
		c1.setUsuario(usuario);		
		clienteService.incluir(c1);
		
		Cliente c2 = new Cliente();
		c2.setNome("Cliente 2");
		c2.setIdade(30);
		c2.setCidade("Belo Horizonte - MG");
		c2.setUsuario(usuario);		
		clienteService.incluir(c2);
		
		Cliente c3 = new Cliente();
		c3.setNome("Cliente 3");
		c3.setIdade(50);
		c3.setCidade("Contagem - MG");
		c3.setUsuario(usuario);		
		clienteService.incluir(c3);
	}	
	
}
