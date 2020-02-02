import { TestBed } from '@angular/core/testing';

import { EpreuveService } from './epreuve.service';

describe('EpreuveService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EpreuveService = TestBed.get(EpreuveService);
    expect(service).toBeTruthy();
  });
});
