import {Component, OnInit} from '@angular/core';
import {PizzaOrderService} from '../pizza-order.service';
import {PizzaOrder} from '../pizzaorder';


@Component({
  selector: 'app-search-pizza-order',
  templateUrl: './search-pizza-order.component.html',
  styleUrls: ['./search-pizza-order.component.scss']
})
export class SearchPizzaOrderComponent implements OnInit {

  orderId: number;
  pizzaOrderArr: PizzaOrder[] = [];

  constructor(private pizzaOrderService: PizzaOrderService) {
  }

  ngOnInit() {
  }


  private searchForPizzaOrders() {

    this.pizzaOrderService.getPizzaOrder(this.orderId).subscribe(pizzaOrdersResponseList => {
      if(pizzaOrdersResponseList == null){
        this.pizzaOrderArr = [];
      }else if(!Array.isArray(pizzaOrdersResponseList)){
        this.pizzaOrderArr = [pizzaOrdersResponseList];
      }else{
        this.pizzaOrderArr = pizzaOrdersResponseList;
      }
    });

  }

  onSubmit() {
    this.searchForPizzaOrders();
  }

}
