package br.edu.infnet.appmedicamento;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appmedicamento.model.domain.Cliente;
import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;
import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;
import br.edu.infnet.appmedicamento.model.domain.Medicamento;
import br.edu.infnet.appmedicamento.model.domain.Pedido;
import br.edu.infnet.appmedicamento.model.domain.Produto;
import br.edu.infnet.appmedicamento.model.service.PedidoService;

@Component
public class PeditoTeste  implements ApplicationRunner{

	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Medicamento m1 = new Medicamento();
		m1.setDescricao("Pantoprazol 40mg Medley Genérico com 42 Comprimidos Revestidos");
		m1.setFabricante("Medley");
		m1.setValor(14.99f);
		m1.setComposicao("PANTOPRAZOL SÓDICO SESQUIIDRATADO (40MG)");
		m1.setIndicacao("Alívio dos sintomas por problemas no estômago");
		m1.setRms("1.8326.0187.009-8");		
		
		HigienePessoal h2 = new HigienePessoal();
		h2.setDescricao("Desodorante Herbíssimo Tradicional Creme Antiperspirante 48h com 55g");
		h2.setFabricante("Dana");
		h2.setValor(6.29f);
		h2.setGenero("Masculino");
		h2.setPerfil("Adulto");
		h2.setPrecaucoes("Realize o Teste de sensibilidade sempre antes da utilização do produto.");		
		
		Dermocosmetico d3 = new Dermocosmetico();
		d3.setDescricao("Hidratante para os Pés Isdin Ureadin Podos 75ml");
		d3.setFabricante("Medley");
		d3.setValor(77.19f);
		d3.setAvaliacao(4.5f);
		d3.setCategoria("Mãos e Pés");
		d3.setModoDeUsar("Aplicar uma ou duas vezes ao dia sobre a pele seca.");		
		
		List<Produto> produtosPrimeiroPedido = new ArrayList<Produto>();
		produtosPrimeiroPedido.add(m1);
		produtosPrimeiroPedido.add(h2);
		List<Produto> produtosDemaisPedido = new ArrayList<Produto>();
		produtosDemaisPedido.add(d3);
		produtosDemaisPedido.add(m1);
		produtosDemaisPedido.add(h2);
		
		Cliente c1 = new Cliente();
		c1.setNome("Cliente 1");
		c1.setIdade(27);
		c1.setCidade("Itaúna - MG");
		
		Pedido p1 = new Pedido(c1);
		p1.setCodigo(123);
		p1.setFreteGratis(false);
		p1.setTipoEntrega("Motoboy");
		p1.setProdutos(produtosPrimeiroPedido);
		System.out.println("Pedido - " + p1);
		pedidoService.incluir(p1);
		
		Pedido p2 = new Pedido();
		p2.setCodigo(456);
		p2.setFreteGratis(true);
		p2.setTipoEntrega("Retirada");
		p2.setCliente(c1);
		p2.setProdutos(produtosDemaisPedido);
		System.out.println("Pedido - " + p2);
		pedidoService.incluir(p2);
		
		Cliente c2 = new Cliente();
		c2.setNome("Cliente 2");
		c2.setIdade(30);
		c2.setCidade("Belo Horizonte - MG");		
		
		Pedido p3 = new Pedido();
		p3.setCodigo(789);		
		p3.setTipoEntrega("Motoboy");
		p3.setCliente(c2);
		p3.setProdutos(produtosDemaisPedido);
		System.out.println("Pedido - " + p3);
		pedidoService.incluir(p3);
	}

}
