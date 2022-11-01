package br.edu.infnet.appmedicamento.model.domain;

public class Medicamento extends Produto {

	public String indicacao;
	public String composicao;
	public String rms;
	
	@Override
	public String toString() {
		return indicacao + ";" + composicao + ";" + rms;
	}
}
