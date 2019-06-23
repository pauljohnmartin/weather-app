import { TestBed, inject } from '@angular/core/testing';

import { MonitorWeatherService } from './monitor-weather.service';

describe('MonitorWeatherService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MonitorWeatherService]
    });
  });

  it('should be created', inject([MonitorWeatherService], (service: MonitorWeatherService) => {
    expect(service).toBeTruthy();
  }));
});
