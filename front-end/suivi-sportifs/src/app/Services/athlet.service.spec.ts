import { TestBed } from '@angular/core/testing';

import { AthletService } from './athlet.service';

describe('AthletService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AthletService = TestBed.get(AthletService);
    expect(service).toBeTruthy();
  });
});
