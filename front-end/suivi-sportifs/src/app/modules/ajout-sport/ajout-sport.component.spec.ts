import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutSportComponent } from './ajout-sport.component';

describe('AjoutSportComponent', () => {
  let component: AjoutSportComponent;
  let fixture: ComponentFixture<AjoutSportComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutSportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutSportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
