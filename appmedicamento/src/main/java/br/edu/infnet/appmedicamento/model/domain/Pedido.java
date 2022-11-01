package br.edu.infnet.appmedicamento.model.domain;

public class Pedido {
	private int codigo;
	private boolean freteGratis;
	private String tipoEntrega;	
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public boolean isFreteGratis() {
		return freteGratis;
	}


	public void setFreteGratis(boolean freteGratis) {
		this.freteGratis = freteGratis;
	}


	public String getTipoEntrega() {
		return tipoEntrega;
	}


	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	@Override
	public String toString() {
		return codigo + ";" + freteGratis + ";" + tipoEntrega;
	}
}
