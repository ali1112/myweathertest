package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {

	@JsonProperty("speed")
	float speed;
	
	@JsonProperty("deg")
	float deg;

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + "]";
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getDeg() {
		return deg;
	}

	public void setDeg(float deg) {
		this.deg = deg;
	}
	
	

}
