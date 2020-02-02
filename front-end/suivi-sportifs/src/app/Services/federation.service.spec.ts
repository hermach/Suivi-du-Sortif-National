import { TestBed } from '@angular/core/testing';

import { FederationService } from './federation.service';

describe('FederationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FederationService = TestBed.get(FederationService);
    expect(service).toBeTruthy();
  });
});
