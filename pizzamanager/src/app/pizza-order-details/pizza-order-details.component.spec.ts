import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PizzaOrderDetailsComponent } from './pizza-order-details.component';

describe('PizzaOrderDetailsComponent', () => {
  let component: PizzaOrderDetailsComponent;
  let fixture: ComponentFixture<PizzaOrderDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PizzaOrderDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PizzaOrderDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
