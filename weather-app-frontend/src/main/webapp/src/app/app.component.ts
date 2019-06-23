import { Component, OnInit } from '@angular/core';
import { MonitorWeatherService } from './service/monitor-weather.service';
import { MonitorWeather } from './model/monitor-weather';
import { City } from './model/city';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';

  monitorWeather: MonitorWeather = new MonitorWeather();

  city: City = new City;

  selectedCity: string;

  listOfCities: City[] = [{ name: 'Sydney'}, {name: 'Melbourne'}, {name: 'Wollongong'}];  

  constructor(private monitorWeatherService: MonitorWeatherService) {}


  changeCity(cityname: any): void {
    console.log(cityname);
    console.log(this.city.name);
    this.selectedCity = cityname;

    this.getByCity();
  }

  getByCity(): void {

    this.monitorWeatherService.getByCity('city/', this.selectedCity).subscribe(
      (data: any) => {
        this.monitorWeather = data;
        console.log(this.monitorWeather);
      }
    );
  }


  ngOnInit() {
    this.selectedCity = 'London';
    this.getByCity();
  }



}
