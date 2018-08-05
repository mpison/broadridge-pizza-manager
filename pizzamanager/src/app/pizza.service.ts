import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Pizza} from './pizza';

@Injectable({
  providedIn: 'root'
})
export class PizzaService {
  private baseUrl = 'http://localhost:8080/broadridge-app/pizzaoptions/';
  private pizzaArray: Pizza[] = [new Pizza(1, "Cheese Pizza"), new Pizza(2, "Pepperoni Pizza"), new Pizza(3, "Veg Pizza")];

  constructor(private http: HttpClient) {
  }

  /*getPizzaList(): Observable<Pizza[]> {
    return this.http.get(`${this.baseUrl}`).map(response => {
      response.json().results.map(item => {
        return new Pizza(item.key, item.value);
      })
    });*/

    //return this.http.get('${this.baseUrl}').then();


  getPizzaList(): Pizza[] {
    return this.pizzaArray;
  }

  getPizzaList2(): Observable<any> {
    /*this.http.get(this.baseUrl).map((response: Response) => {
      response.json()
    })*/

   return this.http.get(this.baseUrl);

    //this.http.get(this.baseUrl).map(res=> res.json());


  }

}
