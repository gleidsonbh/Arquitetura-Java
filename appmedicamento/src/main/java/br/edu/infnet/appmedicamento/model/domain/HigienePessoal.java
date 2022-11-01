package br.edu.infnet.appmedicamento.model.domain;

public class HigienePessoal extends Produto {

	public String precaucoes;
	public String perfil;
	public String genero;
	
	@Override
	public String toString() {
		return precaucoes + ";" + perfil + ";" + genero;
	}	
}
