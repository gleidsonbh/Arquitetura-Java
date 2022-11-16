/*package br.edu.infnet.appmedicamento.model.service;

//import java.util.Collection;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Pedido;
import br.edu.infnet.appmedicamento.model.repository.PedidoRepository;

@Service
public class PedidoService {

	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public void incluir(Pedido pedido) {
		pedidoRepository.save(pedido);
	}
	
	public void excluir(Integer id) {
		pedidoRepository.deleteById(id);
	}	
	
	public Collection<Pedido> obterLista() {
		return (Collection<Pedido>) pedidoRepository.findAll();
	}
	
}
*/