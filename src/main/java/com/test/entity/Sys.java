package com.test.entity;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.test.lib.UnixTimestampDeserializer;

public class Sys {

	@JsonProperty("country")
	String country;
	
	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	@JsonProperty("sunrise")
	DateTime sunrise;
	
	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	@JsonProperty("sunset")
	DateTime sunset;

	@Override
	public String toString() {
		return "Sys [country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public DateTime getSunrise() {
		return sunrise;
	}

	public void setSunrise(DateTime sunrise) {
		this.sunrise = sunrise;
	}

	public DateTime getSunset() {
		return sunset;
	}

	public void setSunset(DateTime sunset) {
		this.sunset = sunset;
	}
	
	
	
	
}
