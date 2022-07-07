package com.japedidos.precificacaoprodutos.entities;

import java.io.Serializable;


/*
 * Representa os ingredientes utilizado na produção da massa ou do molho da pizza
 * 
 * @author fagner.viana
 * 
 * 
 * */

public class Ingredientes implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private Double valor;
	
	//private Integer quantidade;
	
	public Ingredientes (Long id, String nome, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
