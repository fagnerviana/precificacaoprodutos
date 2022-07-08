package com.japedidos.precificacaoprodutos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.japedidos.precificacaoprodutos.entities.Calculadora;
import com.japedidos.precificacaoprodutos.entities.Ingredientes;
import com.japedidos.precificacaoprodutos.repositories.CalculadoraRepository;
import com.japedidos.precificacaoprodutos.repositories.IngredientesRepository;

@SpringBootApplication
public class PrecificacaoprodutosApplication implements CommandLineRunner{

	@Autowired
	private IngredientesRepository ingredientesRepository;
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PrecificacaoprodutosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Instanciando a classe Ingredientes
		Ingredientes ingr1= new Ingredientes(1L, "Leite", 5.0);
		Ingredientes ingr2= new Ingredientes(2L, "Oleo", 9.50);
		Ingredientes ingr3= new Ingredientes(3L, "Farinha", 5.10);
		Ingredientes ingr4= new Ingredientes(4L, "Acucar", 3.80);
		Ingredientes ingr5= new Ingredientes(5L, "sal", 1.10);
		Ingredientes ingr6= new Ingredientes(6L, "Tomate", 3.80);
		Ingredientes ingr7= new Ingredientes(7L, "Cebola", 4.00);
		Ingredientes ingr8= new Ingredientes(8L, "Manjericao", 2.00);
		Ingredientes ingr9= new Ingredientes(9L, "Fermento", 14.00);
		
		Calculadora massa = new Calculadora(1L, "Massa de Pizza", 9.00, 1550.0,ingr1);
		Calculadora molho = new Calculadora(1L,"Molho de Pizza",10.50,1550.0,ingr6);
		
		massa.getIngredientes().addAll(Arrays.asList(ingr1,ingr2,ingr3,ingr4,ingr5,ingr9));
		molho.getIngredientes().addAll(Arrays.asList(ingr4,ingr5,ingr6,ingr7,ingr8));
		
		ingredientesRepository.save(ingr1);
		ingredientesRepository.save(ingr2);
		ingredientesRepository.save(ingr3);
		ingredientesRepository.save(ingr4);
		ingredientesRepository.save(ingr5);
		ingredientesRepository.save(ingr6);
		ingredientesRepository.save(ingr7);
		ingredientesRepository.save(ingr8);
		ingredientesRepository.save(ingr9);
		
		calculadoraRepository.save(molho);
		calculadoraRepository.save(massa);
		
	}

}
