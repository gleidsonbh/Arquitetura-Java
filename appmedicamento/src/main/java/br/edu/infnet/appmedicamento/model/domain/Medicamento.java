package br.edu.infnet.appmedicamento.model.domain;

public class Medicamento extends Produto {

	private String indicacao;
	private String composicao;
	private String rms;
	
	public String getIndicacao() {
		return indicacao;
	}
	
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	
	public String getComposicao() {
		return composicao;
	}
	
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}	
	
	public String getRms() {
		return rms;
	}
	
	public void setRms(String rms) {
		this.rms = rms;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ";" + getIndicacao() + ";" + getComposicao() + ";" + getRms();
	}
}
