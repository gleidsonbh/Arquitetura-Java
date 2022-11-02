package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;

@Service
public class HigienePessoalService {
	private static Map<Integer, HigienePessoal> mapa = new HashMap<Integer,HigienePessoal>();	
	private static Integer id = 1;	

	
	public void incluir(HigienePessoal higienePessoal) {
		higienePessoal.setId(id++);
		mapa.put(higienePessoal.getId(), higienePessoal);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public Collection<HigienePessoal> obterLista() {
		return mapa.values();
	}	
}
