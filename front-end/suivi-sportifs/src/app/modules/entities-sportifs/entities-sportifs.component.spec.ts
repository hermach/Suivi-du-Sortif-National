import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EntitiesSportifsComponent } from './entities-sportifs.component';

describe('EntitiesSportifsComponent', () => {
  let component: EntitiesSportifsComponent;
  let fixture: ComponentFixture<EntitiesSportifsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntitiesSportifsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntitiesSportifsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
