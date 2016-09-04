package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {

	@JsonProperty("lon")
	float lon;
	
	@JsonProperty("lat")
	float lat;

	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "Coordinates [lon=" + lon + ", lat=" + lat + "]";
	}
	
	
	
}
