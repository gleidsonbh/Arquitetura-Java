package br.edu.infnet.appmedicamento.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmedicamento.model.domain.Cliente;
import br.edu.infnet.appmedicamento.model.domain.Usuario;
import br.edu.infnet.appmedicamento.model.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	
	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}
	
	public Collection<Cliente> obterLista() {
		return (Collection<Cliente>) clienteRepository.findAll();
	}	

	public Collection<Cliente> obterLista(Usuario usuario) {
		return (Collection<Cliente>) clienteRepository.obterLista(usuario.getId());
	}	
	
}
