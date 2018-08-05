package com.pizza.broadridgeapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PizzaOrder {

	private int orderId;
	private Pizza pizza;
	private int quantity;
	
	public PizzaOrder() {
		this.pizza = new Pizza();
	}

	public PizzaOrder(int orderId, Pizza pizza, int quantity) {
		super();
		this.orderId = orderId;
		this.pizza = pizza;
		this.quantity = quantity;
	}

	@JsonProperty("orderId")
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Pizza getPizza() {
		return pizza;
	}

	@JsonProperty("pizza")
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public int getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + ((pizza == null) ? 0 : pizza.hashCode());
		result = prime * result + quantity;
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
		PizzaOrder other = (PizzaOrder) obj;
		if (orderId != other.orderId)
			return false;
		if (pizza == null) {
			if (other.pizza != null)
				return false;
		} else if (!pizza.equals(other.pizza))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PizzaOrder [orderId=" + orderId + ", pizza=" + pizza + ", quantity=" + quantity + "]";
	}

	
}
