package br.edu.infnet.appmedicamento.model.domain;

import java.util.List;

public class Pedido {
	private Integer id;
	private Integer codigo;
	private boolean freteGratis;
	private String tipoEntrega;	
	private Cliente cliente;
	private List<Produto> produtos;	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Pedido() {
		this.setFreteGratis(false);
	}
	
	public Pedido(Cliente cliente) {
		this();
		this.cliente = cliente;
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
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return codigo + ";" + freteGratis + ";" + tipoEntrega + ";" + cliente + ";" + produtos.size();
	}
}
