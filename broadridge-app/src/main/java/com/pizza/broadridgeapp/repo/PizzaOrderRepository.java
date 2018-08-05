package com.pizza.broadridgeapp.repo;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pizza.broadridgeapp.model.Pizza;
import com.pizza.broadridgeapp.model.PizzaOrder;
import com.pizza.broadridgeapp.service.PizzaService;

@Repository
public class PizzaOrderRepository {

	@Autowired
	PizzaService pizzaService;
	
	List<PizzaOrder> pizzaOrderList;

	public static final Log log = LogFactory.getLog(PizzaOrderRepository.class);

	PizzaOrderRepository() {
		this.pizzaOrderList = new CopyOnWriteArrayList<PizzaOrder>();
	}

	public int addOrder(PizzaOrder pizzaOrder) {
		
		int orderIndex = -1;
		int pizzaId = pizzaOrder.getPizza().getPizzaId();
		int quantity = pizzaOrder.getQuantity();
		
		Pizza pizza = pizzaService.getPizza(pizzaId);
		
		if( pizza != null) {
			orderIndex = this.pizzaOrderList.size() + 1;
			this.pizzaOrderList.add(new PizzaOrder(orderIndex, pizza, quantity));
		}
		
		return orderIndex;
	}

	public List<PizzaOrder> getPizzaOrderList() {
		return pizzaOrderList;
	}

	public void setPizzaOrderList(List<PizzaOrder> pizzaOrderList) {
		this.pizzaOrderList = pizzaOrderList;
	}

	public PizzaOrder findOrder(int orderId) {		
		Optional<PizzaOrder> pizzaOrder = this.pizzaOrderList.stream().filter(x -> x.getOrderId() == orderId).findFirst();
		
		return pizzaOrder.isPresent() ? pizzaOrder.get() : null;
	}

	public PizzaOrder[] findAll() {		
		return this.pizzaOrderList.toArray(new PizzaOrder[pizzaOrderList.size()]);
	}
	
}
