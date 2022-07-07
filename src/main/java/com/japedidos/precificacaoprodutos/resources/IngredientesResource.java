package com.japedidos.precificacaoprodutos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.japedidos.precificacaoprodutos.entities.Ingredientes;
import com.japedidos.precificacaoprodutos.repositories.IngredientesRepository;

/*
 * Utilizando o @RestController para mapear as instancias da classe Ingedientes
 * Retorna a busca por 
 * 
 * @author fagner.viana
 * 
 * 
 * */


@RestController
@RequestMapping(value = "/ingredientes")
public class IngredientesResource {
	
	
	
	@Autowired
	private IngredientesRepository ingredientesRepository;

	//operação que busca na lista	
	@GetMapping
	public ResponseEntity<List<Ingredientes>> findAll(){
		List<Ingredientes> list = ingredientesRepository.findAll();
		
		//retorna a lista criada
		return ResponseEntity.ok().body(list);
			
		/*
		list.add(new Ingredientes(1L, "Leite", 5.0));
		list.add(new Ingredientes(2L, "Acucar", 3.8));
		list.add(new Ingredientes(3L, "Sal", 1.10));
		list.add(new Ingredientes(4L, "Oleo", 9.80));
		*/
		
		
	}
	
	
	
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Ingredientes> findById(@PathVariable Long id){
		
		Ingredientes ing = ingredientesRepository.findById(id);
		
		return ResponseEntity.ok().body(ing);
		
	}
	
}
