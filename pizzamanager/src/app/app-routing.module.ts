import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PizzaOrderListComponent } from './pizza-order-list/pizza-order-list.component';
import { CreatePizzaOrderComponent } from './create-pizza-order/create-pizza-order.component';
import { SearchPizzaOrderComponent } from './search-pizza-order/search-pizza-order.component';

const routes: Routes = [
  { path: '', redirectTo: 'add', pathMatch: 'full' },
  { path: 'add', component: CreatePizzaOrderComponent },
  { path: 'pizzaOrder', component: PizzaOrderListComponent },
  { path: 'searchPizzaOrder', component: SearchPizzaOrderComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
