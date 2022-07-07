package com.japedidos.precificacaoprodutos.repositories;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.japedidos.precificacaoprodutos.entities.Ingredientes;

/*
 * Esta classe irá realizar as injeções no banco de dados
 * 
 * @author fagner.viana
 * 
 * 
 * */

@Component
public class IngredientesRepository {
	
	
	
	private Map<Long, Ingredientes> map =  new HashMap<>();
	
	public void save(Ingredientes obj) {
		map.put(obj.getId(), obj);
		
	}
	
	public Ingredientes findById(Long id) {
		
		return map.get(id);
	}
	
	public List<Ingredientes> findAll(){
		
		return new ArrayList<Ingredientes>(map.values());
				
	}
	

}
