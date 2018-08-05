package com.pizza.broadridgeapp.util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.pizza.broadridgeapp.model.Pizza;

public class PizzaUtil {

	public static Map<Integer, String> transformPizzaListToMap(List<Pizza> pizzaList) {		
		return pizzaList.stream().collect(Collectors.toMap(Pizza::getPizzaId, Pizza::getPizzaName));
	}

}
