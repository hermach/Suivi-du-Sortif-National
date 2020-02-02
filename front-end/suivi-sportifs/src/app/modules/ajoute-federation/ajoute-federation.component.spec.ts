import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjouteFederationComponent } from './ajoute-federation.component';

describe('AjouteFederationComponent', () => {
  let component: AjouteFederationComponent;
  let fixture: ComponentFixture<AjouteFederationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjouteFederationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjouteFederationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
