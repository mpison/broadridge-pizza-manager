package com.pizza.broadridgeapp.repo;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.pizza.broadridgeapp.model.Pizza;

@Repository
public class PizzaRepository {
	List<Pizza> pizzaList = new CopyOnWriteArrayList<Pizza>();
	
	PizzaRepository(){
		pizzaList.add(new Pizza(1, "Cheese Pizza"));
		pizzaList.add(new Pizza(2, "Pepporoni Pizza"));
		pizzaList.add(new Pizza(3, "Veg Pizza"));
	}
	
	public List<Pizza> getPizzaOptions() {
		return pizzaList;
	}
	
	public Pizza findPizza(int pizzaId) {
		Optional<Pizza> pizza = this.pizzaList.stream().filter(x -> x.getPizzaId() == pizzaId).findFirst();
		
		return pizza.isPresent() == true ? pizza.get() : null;		
	}
	
}
