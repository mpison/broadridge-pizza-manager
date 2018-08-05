import {Component, OnInit} from '@angular/core';
import {PizzaOrder} from '../pizzaorder';
import {PizzaOrderService} from '../pizza-order.service';
import {PizzaService} from '../pizza.service';
import {Pizza} from '../pizza';
import {NgForm} from "@angular/forms";
import {Observable} from 'rxjs';

@Component({
  selector: 'app-create-pizza-order',
  templateUrl: './create-pizza-order.component.html',
  styleUrls: ['./create-pizza-order.component.scss']
})
export class CreatePizzaOrderComponent implements OnInit {

  pizzaOrder: PizzaOrder;
  submitted = false;

  pizzaOptions: Pizza[] = [];

  constructor(private pizzaOrderService: PizzaOrderService, private pizzaService: PizzaService) {
    this.pizzaOrder = new PizzaOrder();
  }

  ngOnInit() {
    this.pizzaOrder = new PizzaOrder();
    this.submitted = false;

    this.pizzaService.getPizzaList2().subscribe(response => {
      let i = 0;
      for(let key in response){
        this.pizzaOptions[i] = new Pizza(parseInt(key), response[key]);
        i++;
      }
    })

  }

  newPizzaOrder(): void {
    this.submitted = false;
    this.pizzaOrder = new PizzaOrder();
  }

  save() {
    console.log(this.pizzaOrder);
    this.pizzaOrderService.createPizzaOrder(this.pizzaOrder)
      .subscribe(data => console.log("data="+data), error => console.log(error));
    this.pizzaOrder = new PizzaOrder();
  }

  onSubmit(pizzaForm: NgForm) {
    //console.log("pizzaform = " + JSON.stringify(pizzaForm.value));
    if(pizzaForm.valid) {
      this.pizzaOrder = pizzaForm.value;
      this.submitted = true;
      this.save();
    }
  }

}
