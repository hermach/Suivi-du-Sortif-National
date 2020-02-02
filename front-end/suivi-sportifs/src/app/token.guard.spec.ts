import { TestBed, async, inject } from '@angular/core/testing';

import { TokenGuard } from './token.guard';

describe('TokenGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TokenGuard]
    });
  });

  it('should ...', inject([TokenGuard], (guard: TokenGuard) => {
    expect(guard).toBeTruthy();
  }));
});
