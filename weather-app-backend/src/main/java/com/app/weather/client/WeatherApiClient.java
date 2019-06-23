package com.app.weather.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.weather.model.MonitorWeather;

@FeignClient(name = "WeatherApiClient", url = "${weather-api}")	
public interface WeatherApiClient {
	
	@RequestMapping("/weather?q={cityName}&${api-key}")
	public MonitorWeather findByCity(@PathVariable(value = "cityName") String cityName);

}
