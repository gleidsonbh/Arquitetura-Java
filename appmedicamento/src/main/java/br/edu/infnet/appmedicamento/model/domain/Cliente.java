package br.edu.infnet.appmedicamento.model.domain;

public class Cliente {
	public String nome;
	public int idade;
	public String cidade;
	
	@Override
	public String toString() {
		return nome + ";" + idade + ";" + cidade;
	}
}
