import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchPizzaOrderComponent } from './search-pizza-order.component';

describe('SearchPizzaOrderComponent', () => {
  let component: SearchPizzaOrderComponent;
  let fixture: ComponentFixture<SearchPizzaOrderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchPizzaOrderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchPizzaOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
