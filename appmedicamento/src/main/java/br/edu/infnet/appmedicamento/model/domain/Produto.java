package br.edu.infnet.appmedicamento.model.domain;

public abstract class Produto {
	private Integer id;
	private String descricao;
	private float valor;
	private String fabricante;	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}	
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return getId() + ";" + getDescricao() + ";" + getValor() + ";" + getFabricante();
	}
}
