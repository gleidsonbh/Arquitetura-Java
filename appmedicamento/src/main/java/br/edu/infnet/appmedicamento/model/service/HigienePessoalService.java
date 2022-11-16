package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.HigienePessoal;
import br.edu.infnet.appmedicamento.model.repository.HigienePessoalRepository;

@Service
public class HigienePessoalService {

	@Autowired
	private HigienePessoalRepository higienePessoalRepository;
	
	public void incluir(HigienePessoal higienePessoal) {
		higienePessoalRepository.save(higienePessoal);
	}
	
	public void excluir(Integer id) {
		higienePessoalRepository.deleteById(id);
	}
	
	public Collection<HigienePessoal> obterLista() {
		return (Collection<HigienePessoal>) higienePessoalRepository.findAll();
	}	
}
