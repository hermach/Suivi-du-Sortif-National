import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TranchAgeComponent } from './tranch-age.component';

describe('TranchAgeComponent', () => {
  let component: TranchAgeComponent;
  let fixture: ComponentFixture<TranchAgeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TranchAgeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TranchAgeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
