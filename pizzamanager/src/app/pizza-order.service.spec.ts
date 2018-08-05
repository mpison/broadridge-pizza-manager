import { TestBed, inject } from '@angular/core/testing';

import { PizzaOrderService } from './pizza-order.service';

describe('PizzaOrderService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PizzaOrderService]
    });
  });

  it('should be created', inject([PizzaOrderService], (service: PizzaOrderService) => {
    expect(service).toBeTruthy();
  }));
});
