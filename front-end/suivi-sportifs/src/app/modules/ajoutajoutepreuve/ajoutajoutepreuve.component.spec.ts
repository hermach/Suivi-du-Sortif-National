import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutajoutepreuveComponent } from './ajoutajoutepreuve.component';

describe('AjoutajoutepreuveComponent', () => {
  let component: AjoutajoutepreuveComponent;
  let fixture: ComponentFixture<AjoutajoutepreuveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AjoutajoutepreuveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutajoutepreuveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
