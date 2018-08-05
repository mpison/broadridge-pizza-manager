package com.pizza.broadridgeapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pizza implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8157666599302350162L;
	
	private int pizzaId;
	
	private String pizzaName;
	
	Pizza(){
		
	}

	public Pizza(int pizzaId, String pizzaName) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
	}

	public int getPizzaId() {
		return pizzaId;
	}

	@JsonProperty("pizzaId")
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	
	public String getPizzaName() {
		return pizzaName;
	}

	@JsonProperty("pizzaName")
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pizzaId;
		result = prime * result + ((pizzaName == null) ? 0 : pizzaName.hashCode());
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
		Pizza other = (Pizza) obj;
		if (pizzaId != other.pizzaId)
			return false;
		if (pizzaName == null) {
			if (other.pizzaName != null)
				return false;
		} else if (!pizzaName.equals(other.pizzaName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + "]";
	}
	
	
}
