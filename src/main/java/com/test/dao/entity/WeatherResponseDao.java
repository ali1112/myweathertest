package com.test.dao.entity;

import java.sql.Timestamp;

public class WeatherResponseDao {

	Integer id;
	Long localtionId; 
	String locationName; 
	String country;
	float coordLon; 
	float coordLat; 
	float rain3h;
	float snow3h; 
	float clouds3h; 
	float windSpeed ;
	float windDeg;
	float visibility; 
	Timestamp date;
	Timestamp sunrise; 
	Timestamp sunset;
	float temp;
	Integer tempUnit; 
	float pressure;
	float humidity;
	float tempMin;
	float tempMax;	
	Timestamp weatherReuestDate;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getLocaltionId() {
		return localtionId;
	}
	public void setLocaltionId(Long localtionId) {
		this.localtionId = localtionId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public float getCoordLon() {
		return coordLon;
	}
	public void setCoordLon(float coord_lon) {
		this.coordLon = coord_lon;
	}
	public float getCoordLat() {
		return coordLat;
	}
	public void setCoordLat(float coord_lat) {
		this.coordLat = coord_lat;
	}
	public float getRain3h() {
		return rain3h;
	}
	public void setRain3h(float rain3h) {
		this.rain3h = rain3h;
	}
	public float getSnow3h() {
		return snow3h;
	}
	public void setSnow3h(float snow3h) {
		this.snow3h = snow3h;
	}
	public float getClouds3h() {
		return clouds3h;
	}
	public void setClouds3h(float clouds3h) {
		this.clouds3h = clouds3h;
	}
	public float getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}
	public float getWindDeg() {
		return windDeg;
	}
	public void setWindDeg(float windDeg) {
		this.windDeg = windDeg;
	}
	public float getVisibility() {
		return visibility;
	}
	public void setVisibility(float visibility) {
		this.visibility = visibility;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Timestamp getSunrise() {
		return sunrise;
	}
	public void setSunrise(Timestamp sunrise) {
		this.sunrise = sunrise;
	}
	public Timestamp getSunset() {
		return sunset;
	}
	public void setSunset(Timestamp sunset) {
		this.sunset = sunset;
	}
	public Timestamp getWeatherReuestDate() {
		return weatherReuestDate;
	}
	public void setWeatherReuestDate(Timestamp weatherReuestDate) {
		this.weatherReuestDate = weatherReuestDate;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public Integer getTempUnit() {
		return tempUnit;
	}
	public void setTempUnit(Integer tempUnit) {
		this.tempUnit = tempUnit;
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
	
	
}
