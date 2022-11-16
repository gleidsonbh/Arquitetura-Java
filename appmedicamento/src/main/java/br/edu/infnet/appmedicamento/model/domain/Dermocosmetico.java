package br.edu.infnet.appmedicamento.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tdermocosmetico")
public class Dermocosmetico extends Produto {
	private String modoDeUsar;
	private float avaliacao;
	private String categoria;
	
	public String getModoDeUsar() {
		return modoDeUsar;
	}
	
	public void setModoDeUsar(String modoDeUsar) {
		this.modoDeUsar = modoDeUsar;
	}
	
	public float getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}	
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}		
	
	@Override
	public String toString() {
		return super.toString() + ";" + modoDeUsar + ";" + avaliacao + ";" + categoria;
	}	
	
}
