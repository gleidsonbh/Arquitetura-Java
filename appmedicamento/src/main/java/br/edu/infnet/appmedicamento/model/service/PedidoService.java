package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Pedido;

@Service
public class PedidoService {
	private static Map<Integer, Pedido> mapa = new HashMap<Integer,Pedido>();	
	private static Integer id = 1;	
	
	public void incluir(Pedido pedido) {
		pedido.setId(id++);
		mapa.put(pedido.getId(), pedido);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}	
	
	public Collection<Pedido> obterLista() {
		return mapa.values();
	}
}
