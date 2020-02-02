import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllAthletsComponent } from './all-athlets.component';

describe('AllAthletsComponent', () => {
  let component: AllAthletsComponent;
  let fixture: ComponentFixture<AllAthletsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllAthletsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllAthletsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
