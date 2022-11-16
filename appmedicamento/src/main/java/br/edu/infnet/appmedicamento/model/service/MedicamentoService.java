package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appmedicamento.model.domain.Medicamento;
import br.edu.infnet.appmedicamento.model.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
	
	@Autowired
	private MedicamentoRepository medicamentoRepository;	
	
	public void incluir(Medicamento medicamento) {
		medicamentoRepository.save(medicamento);
	}
	
	public void excluir(Integer id) {
		medicamentoRepository.deleteById(id);
	}
	
	public Collection<Medicamento> obterLista() {
		return (Collection<Medicamento>) medicamentoRepository.findAll();
	}
	
}
