package br.edu.infnet.appmedicamento;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmedicamento.model.domain.Pedido;

@Component
public class PeditoTeste  implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pedido p1 = new Pedido();
		p1.setCodigo(123);
		p1.setFreteGratis(false);
		p1.setTipoEntrega("Motoboy");
		System.out.println("Pedido - " + p1);
		
		Pedido p2 = new Pedido();
		p2.setCodigo(456);
		p2.setFreteGratis(true);
		p2.setTipoEntrega("Retirada");
		System.out.println("Pedido - " + p2);
		
		Pedido p3 = new Pedido();
		p3.setCodigo(789);
		p3.setFreteGratis(false);
		p3.setTipoEntrega("Motoboy");
		System.out.println("Pedido - " + p3);
		
	}

}
