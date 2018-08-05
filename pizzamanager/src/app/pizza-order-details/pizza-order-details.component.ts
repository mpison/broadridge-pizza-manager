import { Component, OnInit, Input } from '@angular/core';
import {PizzaOrderService} from '../pizza-order.service';
import {PizzaOrder} from "../pizzaorder";

@Component({
  selector: 'app-pizza-order-details',
  templateUrl: './pizza-order-details.component.html',
  styleUrls: ['./pizza-order-details.component.scss']
})
export class PizzaOrderDetailsComponent implements OnInit {

  @Input() pizzaOrder: PizzaOrder;

  constructor(private pizzaOrderService?: PizzaOrderService) { }

  ngOnInit() {
  }

}
