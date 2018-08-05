import {Pizza} from './pizza';
export class PizzaOrder {
  orderId: number;
  pizza: Pizza = new Pizza();
  quantity: number;
}
