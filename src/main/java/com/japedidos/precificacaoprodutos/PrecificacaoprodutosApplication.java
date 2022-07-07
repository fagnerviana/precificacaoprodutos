package com.japedidos.precificacaoprodutos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.japedidos.precificacaoprodutos.entities.Ingredientes;
import com.japedidos.precificacaoprodutos.repositories.IngredientesRepository;

@SpringBootApplication
public class PrecificacaoprodutosApplication implements CommandLineRunner{

	@Autowired
	private IngredientesRepository ingredientesRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PrecificacaoprodutosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ingredientes ingr1= new Ingredientes(1L, "Leite", 5.0);
		Ingredientes ingr2= new Ingredientes(2L, "Oleo", 9.50);
		
		ingredientesRepository.save(ingr1);
		ingredientesRepository.save(ingr2);
		
	}

}
