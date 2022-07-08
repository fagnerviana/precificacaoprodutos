package com.japedidos.precificacaoprodutos.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/*
 * Irá realizar a junção dos ingredientes e forma o valor final , com a soma de todos os ingredientes
 * 
 * @author fagner.viana
 *  
 * */

public class Calculadora implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private Double totalValor;
	private Double peso;
	
	private Ingredientes ingrediente;
	
	
	
	private List<Ingredientes> ingredientes = new ArrayList<>();

    
	public Calculadora() {
		
	}
	
	public Calculadora(Long id, String nome, Double totalValor, Double peso,Ingredientes ingrediente) {
		super();
		this.id = id;
		this.nome = nome;
		this.totalValor = totalValor;
		this.peso = peso;
		this.ingrediente = ingrediente;
		
		
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

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public List<Ingredientes> getIngredientes() {
		return ingredientes;
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
		Calculadora other = (Calculadora) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		

}
