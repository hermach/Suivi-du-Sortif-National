import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailFederationComponent } from './detail-federation.component';

describe('DetailFederationComponent', () => {
  let component: DetailFederationComponent;
  let fixture: ComponentFixture<DetailFederationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailFederationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailFederationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
