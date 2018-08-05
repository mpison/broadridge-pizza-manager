import {Component, OnInit} from '@angular/core';
import {PizzaOrder} from '../pizzaorder';
import {PizzaOrderService} from '../pizza-order.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-pizza-order-list',
  templateUrl: './pizza-order-list.component.html',
  styleUrls: ['./pizza-order-list.component.scss']
})
export class PizzaOrderListComponent implements OnInit {
  pizzaOrdersList: Observable<PizzaOrder[]>;

  constructor(private pizzaOrderService: PizzaOrderService) {
  }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.pizzaOrdersList = this.pizzaOrderService.getPizzaOrderArray();
  }

}
