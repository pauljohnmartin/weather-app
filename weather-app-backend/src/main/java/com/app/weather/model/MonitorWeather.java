package com.app.weather.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MonitorWeather {
	
	private int id;
	private String name;
	private List<Weather> weather = new ArrayList<>();
	private Wind wind;
	private Main main;
	private String dt;
	
	@JsonCreator
	public MonitorWeather(String name, List<Weather> weather, Wind wind, String dt, Main main) {
		super();
		this.name = name;
		this.weather = weather;
		this.wind = wind;
		this.dt = dt;
		this.main = main;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	
	
	
	
	
	
	
	

}
