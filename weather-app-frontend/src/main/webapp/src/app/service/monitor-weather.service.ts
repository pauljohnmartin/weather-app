import { Injectable } from '@angular/core';

import { environment as env } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MonitorWeatherService {

  constructor(private http: HttpClient) { }

  API_URL = env.API_URL;
  ENDPOINT = 'weather/';

  public getByCity(resource, city) {
    return this.http.get(`${this.API_URL}${this.ENDPOINT}${resource}/${city}`);
  }
}
