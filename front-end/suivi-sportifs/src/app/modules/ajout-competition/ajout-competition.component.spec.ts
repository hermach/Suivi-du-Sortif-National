import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutCompetitionComponent } from './ajout-competition.component';

describe('AjoutCompetitionComponent', () => {
  let component: AjoutCompetitionComponent;
  let fixture: ComponentFixture<AjoutCompetitionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutCompetitionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutCompetitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
