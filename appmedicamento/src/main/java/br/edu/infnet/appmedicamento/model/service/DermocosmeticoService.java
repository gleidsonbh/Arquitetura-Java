package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;
import br.edu.infnet.appmedicamento.model.repository.DermocosmeticoRepository;

@Service
public class DermocosmeticoService {

	@Autowired
	private DermocosmeticoRepository dermocosmeticoRepository;
	
	public void incluir(Dermocosmetico dermocosmetico) {
		dermocosmeticoRepository.save(dermocosmetico);
	}
	
	public void excluir(Integer id) {
		dermocosmeticoRepository.deleteById(id);
	}
	
	public Collection<Dermocosmetico> obterLista() {
		return (Collection<Dermocosmetico>) dermocosmeticoRepository.findAll();
	}	
}
