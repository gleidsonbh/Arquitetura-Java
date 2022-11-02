package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Cliente;

@Service
public class ClienteService {

	private static Map<Integer, Cliente> mapa = new HashMap<Integer,Cliente>();	
	private static Integer id = 1;	

	
	public void incluir(Cliente cliente) {
		cliente.setId(id++);
		mapa.put(cliente.getId(), cliente);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public Collection<Cliente> obterLista() {
		return mapa.values();
	}	

}
