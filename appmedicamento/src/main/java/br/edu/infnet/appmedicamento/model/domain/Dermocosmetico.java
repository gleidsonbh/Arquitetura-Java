package br.edu.infnet.appmedicamento.model.domain;

public class Dermocosmetico extends Produto {
	public String modoDeUsar;
	public float avaliacao;
	public String categoria;
	
	@Override
	public String toString() {
		return modoDeUsar + ";" + avaliacao + ";" + categoria;
	}	
	
}
