import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChartPerComponent } from './chart-per.component';

describe('ChartPerComponent', () => {
  let component: ChartPerComponent;
  let fixture: ComponentFixture<ChartPerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChartPerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChartPerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
