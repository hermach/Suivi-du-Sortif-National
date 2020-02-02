import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutCritreComponent } from './ajout-critre.component';

describe('AjoutCritreComponent', () => {
  let component: AjoutCritreComponent;
  let fixture: ComponentFixture<AjoutCritreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutCritreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutCritreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
