import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OneAthletComponent } from './one-athlet.component';

describe('OneAthletComponent', () => {
  let component: OneAthletComponent;
  let fixture: ComponentFixture<OneAthletComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OneAthletComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OneAthletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
