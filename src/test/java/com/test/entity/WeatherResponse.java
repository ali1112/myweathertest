package com.test.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.test.lib.UnixTimestampDeserializer;


public class WeatherResponse {
	
	@JsonProperty("name")
	String name;

	@JsonProperty("id")
	String id;
	
	@JsonProperty("visibility")
	Integer visibility;
	
	@JsonProperty("coord")
	Coordinates coord;
	
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
	@JsonProperty("dt")
	DateTime date;
	
	@JsonProperty("rain")
	Rain rain;
	
	@JsonProperty("snow")
	Snow snow3h;
	
	@JsonProperty("clouds")
	Clouds clouds;
	
	@JsonProperty("wind")
	Wind wind;
	
	@JsonProperty("sys")
	Sys sys;
	
	@JsonProperty("main")
	MainWeather mainWeather;
	
	@Override
	public String toString() {
		return "WeatherResponse [name=" + name + ", id=" + id + ", visibility=" + visibility + ", coord=" + coord
				+ ", date=" + date + ", rain=" + rain + ", snow3h=" + snow3h + ", clouds=" + clouds + ", wind=" + wind
				+ ", sys=" + sys + ", mainWeather=" + mainWeather + ", weather=" + Arrays.toString(weather) + "]";
	}

	public MainWeather getMainWeather() {
		return mainWeather;
	}

	public void setMainWeather(MainWeather mainWeather) {
		this.mainWeather = mainWeather;
	}

	@JsonProperty("weather")
	Weather [] weather;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinates getCoordinates() {
		return coord;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coord = coordinates;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Coordinates getCoord() {
		return coord;
	}

	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}

	public Rain getRain() {
		return rain;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public Snow getSnow3h() {
		return snow3h;
	}

	public void setSnow3h(Snow snow3h) {
		this.snow3h = snow3h;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}
	
	
	
}
