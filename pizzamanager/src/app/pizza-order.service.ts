import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Pizza} from "./pizza";

@Injectable({
  providedIn: 'root'
})
export class PizzaOrderService {
  private baseUrl = 'http://localhost:8080/broadridge-app/pizza/';


  constructor(private http: HttpClient) {
  }

  getPizzaOrder(pizzaOrderId: number): Observable<any> {
    return this.http.get(this.baseUrl + pizzaOrderId);
  }

  getPizzaOrderArray(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

  createPizzaOrder(pizzaOrder: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, pizzaOrder);
  }
}
