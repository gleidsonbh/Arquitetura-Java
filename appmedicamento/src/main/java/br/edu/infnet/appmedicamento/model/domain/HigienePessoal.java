package br.edu.infnet.appmedicamento.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "thigienepessoal")
public class HigienePessoal extends Produto {

	private String precaucoes;
	private String perfil;
	private String genero;
	
	public String getPrecaucoes() {
		return precaucoes;
	}
	
	public void setPrecaucoes(String precaucoes) {
		this.precaucoes = precaucoes;
	}
	
	public String getPerfil() {
		return perfil;
	}
	
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}	
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}	
	
	@Override
	public String toString() {
		return super.toString() + ";" + getPrecaucoes() + ";" + getPerfil() + ";" + getGenero();
	}	
}
