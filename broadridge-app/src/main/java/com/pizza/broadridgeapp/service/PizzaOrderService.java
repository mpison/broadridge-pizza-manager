package com.pizza.broadridgeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.broadridgeapp.model.Pizza;
import com.pizza.broadridgeapp.model.PizzaOrder;
import com.pizza.broadridgeapp.repo.PizzaOrderRepository;

@Service
public class PizzaOrderService {
	
	@Autowired
	PizzaOrderRepository pizzaOrderRepository;
	
	
	PizzaOrderService(){		
	}
	
	public int addPizzaOrder(PizzaOrder pizzaOrder) {
		return pizzaOrderRepository.addOrder(pizzaOrder);
	}

	public PizzaOrder findOrder(int orderId) {		
		return pizzaOrderRepository.findOrder(orderId);
	}

	public PizzaOrder[] findAll() {		
		return pizzaOrderRepository.findAll();
	}
	
}
