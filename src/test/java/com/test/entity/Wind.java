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
	
	

}
