import { TestBed } from '@angular/core/testing';

import { CriterService } from './criter.service';

describe('CriterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CriterService = TestBed.get(CriterService);
    expect(service).toBeTruthy();
  });
});
