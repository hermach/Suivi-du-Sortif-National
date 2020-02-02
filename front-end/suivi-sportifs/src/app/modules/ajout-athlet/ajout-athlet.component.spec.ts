import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutAthletComponent } from './ajout-athlet.component';

describe('AjoutAthletComponent', () => {
  let component: AjoutAthletComponent;
  let fixture: ComponentFixture<AjoutAthletComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutAthletComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutAthletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
