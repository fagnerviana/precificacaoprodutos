package com.japedidos.precificacaoprodutos.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.japedidos.precificacaoprodutos.entities.Calculadora;

@Component
public class CalculadoraRepository {
	
	
private Map<Long, Calculadora> map =  new HashMap<>();
	
	public void save(Calculadora obj) {
		map.put(obj.getId(), obj);
		
	}
	
	public Calculadora findById(Long id) {
		
		return map.get(id);
	}
	
	public List<Calculadora> findAll(){
	return new ArrayList<Calculadora>(map.values());
				
	}
	

}
