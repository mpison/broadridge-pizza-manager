package com.pizza.broadridgeapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.broadridgeapp.model.Pizza;
import com.pizza.broadridgeapp.service.PizzaService;
import com.pizza.broadridgeapp.util.PizzaUtil;

@CrossOrigin(maxAge = 3600)
@RestController
public class PizzaController {
	@Autowired
	PizzaService pizzaService;
	
	@GetMapping("pizzaoptions")
	public ResponseEntity<?>  getPizzaList() {
				
		List<Pizza> pizzaList = pizzaService.getPizzaOptions();
			
		return new ResponseEntity<Map<Integer, String>>(PizzaUtil.transformPizzaListToMap(pizzaList), HttpStatus.OK);
	}
}
