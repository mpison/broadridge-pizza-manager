package com.pizza.broadridgeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.broadridgeapp.model.Pizza;
import com.pizza.broadridgeapp.repo.PizzaRepository;

@Service
public class PizzaService {
	
	
	@Autowired
	PizzaRepository pizzaRepo;
	
	public PizzaService() {
		
	}
	
	public List<Pizza> getPizzaOptions() {
		return pizzaRepo.getPizzaOptions();
	}
	
	public Pizza getPizza(int pizzaId) {
		return pizzaRepo.findPizza(pizzaId);
	}
	
	
}