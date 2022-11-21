package br.edu.infnet.appmedicamento.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmedicamento.model.domain.Dermocosmetico;


@Repository
public interface DermocosmeticoRepository extends CrudRepository<Dermocosmetico, Integer> {

	
}
