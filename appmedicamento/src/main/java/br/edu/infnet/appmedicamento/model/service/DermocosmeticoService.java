package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;

@Service
public class DermocosmeticoService {

	private static Map<Integer, Dermocosmetico> mapa = new HashMap<Integer,Dermocosmetico>();	
	private static Integer id = 1;	

	
	public void incluir(Dermocosmetico dermocosmetico) {
		dermocosmetico.setId(id++);
		mapa.put(dermocosmetico.getId(), dermocosmetico);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public Collection<Dermocosmetico> obterLista() {
		return mapa.values();
	}	
}
