package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import br.edu.infnet.appmedicamento.model.domain.Medicamento;

@Service
public class MedicamentoService {
	
	private static Map<Integer, Medicamento> mapa = new HashMap<Integer,Medicamento>();	
	private static Integer id = 1;		
	
	public void incluir(Medicamento medicamento) {
		medicamento.setId(id++);
		mapa.put(medicamento.getId(), medicamento);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public Collection<Medicamento> obterLista() {
		return mapa.values();
	}
	
}
