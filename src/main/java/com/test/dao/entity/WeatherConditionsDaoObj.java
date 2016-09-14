package com.test.dao.entity;

public class WeatherConditionsDaoObj {
	
	Integer id;
	Integer weatherResponseId;
	String main;
	String description;
	String icon;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWeatherResponseId() {
		return weatherResponseId;
	}
	public void setWeatherResponseId(Integer weatherResponseId) {
		this.weatherResponseId = weatherResponseId;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
