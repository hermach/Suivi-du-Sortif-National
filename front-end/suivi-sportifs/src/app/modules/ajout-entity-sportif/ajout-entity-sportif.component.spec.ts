import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutEntitySportifComponent } from './ajout-entity-sportif.component';

describe('AjoutEntitySportifComponent', () => {
  let component: AjoutEntitySportifComponent;
  let fixture: ComponentFixture<AjoutEntitySportifComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutEntitySportifComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutEntitySportifComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
