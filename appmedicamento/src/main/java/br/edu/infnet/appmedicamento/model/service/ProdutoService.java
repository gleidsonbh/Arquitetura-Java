package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Produto;

@Service
public class ProdutoService {
	private static Map<Integer, Produto> mapa = new HashMap<Integer,Produto>();	
	private static Integer id = 1;	
	
	public void incluir(Produto produto) {
		produto.setId(id++);
		mapa.put(produto.getId(), produto);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}	
	
	public Collection<Produto> obterLista() {
		return mapa.values();
	}

}
