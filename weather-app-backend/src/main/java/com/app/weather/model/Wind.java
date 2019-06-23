package com.app.weather.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Wind {
	
	private double speed;
	private int deg;
	
	public Wind(double speed, int deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}
	
	

}
