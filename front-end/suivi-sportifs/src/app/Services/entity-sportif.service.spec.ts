import { TestBed } from '@angular/core/testing';

import { EntitySportifService } from './entity-sportif.service';

describe('EntitySportifService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EntitySportifService = TestBed.get(EntitySportifService);
    expect(service).toBeTruthy();
  });
});
