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

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private Double valor;
	
	private Calculadora calculadora;
	
	//private Integer quantidade;
	
	public Ingredientes (Long id, String nome, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	
	
	

	public Ingredientes(Long id, String nome, Double valor, Calculadora calculadora) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.calculadora = calculadora;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredientes other = (Ingredientes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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



	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	
	

}
