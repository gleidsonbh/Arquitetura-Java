package br.edu.infnet.appmedicamento.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmedicamento.model.domain.Produto;


@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
