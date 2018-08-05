package com.pizza.broadridgeapp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.pizza.broadridgeapp.model.PizzaOrder;
import com.pizza.broadridgeapp.service.PizzaOrderService;

@CrossOrigin(maxAge = 3600)
@RestController
public class PizzaOrderController {

	public static final Log log = LogFactory.getLog(PizzaOrderController.class);

	@Autowired
	PizzaOrderService pizzaOrderService;

	@PostMapping("/pizza/")
	public ResponseEntity<?> createPizza(@RequestBody PizzaOrder pizzaOrder, UriComponentsBuilder ucBuilder) {

		int orderId = pizzaOrderService.addPizzaOrder(pizzaOrder);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/pizza/{orderId}").buildAndExpand(orderId).toUri());
		
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/pizza/")
	public ResponseEntity<?> getPizzaOrderList() {
		PizzaOrder[] pizzaOrderArr = pizzaOrderService.findAll();

		return new ResponseEntity<PizzaOrder[]>(pizzaOrderArr, HttpStatus.OK);
	}

	@GetMapping("/pizza/{orderId}")
	public ResponseEntity<?> getPizzaOrder(@PathVariable("orderId") int orderId) {
		PizzaOrder pizzaOrder = pizzaOrderService.findOrder(orderId);

		return new ResponseEntity<PizzaOrder>(pizzaOrder, HttpStatus.OK);
	}

}
