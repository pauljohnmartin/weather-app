package com.app.weather.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.weather.client.WeatherApiClient;
import com.app.weather.model.MonitorWeather;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/weather/")
public class MonitorWeatherResource {
	
	@Autowired
	private WeatherApiClient weatherApiClient;
	
	@GetMapping("/city/{cityName}")
	public MonitorWeather findByCity(@PathVariable String cityName) {
		return weatherApiClient.findByCity(cityName);
	}

}
