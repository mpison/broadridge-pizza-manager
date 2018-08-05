import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';

import {AppComponent} from './app.component';
import {CreatePizzaOrderComponent} from './create-pizza-order/create-pizza-order.component';
import {PizzaOrderListComponent} from './pizza-order-list/pizza-order-list.component';
import {PizzaOrderDetailsComponent} from './pizza-order-details/pizza-order-details.component';
import {AppRoutingModule} from './app-routing.module';
import {HttpClientModule, HttpClient} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {SearchPizzaOrderComponent} from './search-pizza-order/search-pizza-order.component';


@NgModule({
  declarations: [
    AppComponent,
    CreatePizzaOrderComponent,
    PizzaOrderListComponent,
    PizzaOrderDetailsComponent,
    SearchPizzaOrderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
