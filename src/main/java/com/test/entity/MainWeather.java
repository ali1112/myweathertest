package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainWeather {

	@JsonProperty("temp")
	float temp;
	
	@JsonProperty("pressure")
	float pressure;

	@JsonProperty("humidity")
	float humidity;
	
	@JsonProperty("temp_min")
	float tempMin;
	
	@JsonProperty("temp_max")
	float tempMax;

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getTempMin() {
		return tempMin;
	}

	public void setTempMin(float tempMin) {
		this.tempMin = tempMin;
	}

	public float getTempMax() {
		return tempMax;
	}

	public void setTempMax(float tempMax) {
		this.tempMax = tempMax;
	}

	@Override
	public String toString() {
		return "MainWeather [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", tempMin="
				+ tempMin + ", tempMax=" + tempMax + "]";
	}
	
	
	
}
