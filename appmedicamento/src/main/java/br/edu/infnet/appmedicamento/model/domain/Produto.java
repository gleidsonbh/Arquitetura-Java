package br.edu.infnet.appmedicamento.model.domain;

public class Produto {
	public String descricao;
	public float valor;
	public String fabricante;
	
	@Override
	public String toString() {
		return descricao + ";" + valor + ";" + fabricante;
	}
}
