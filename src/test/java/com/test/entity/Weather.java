package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

	@JsonProperty("id")
	Integer id;
	
	@JsonProperty("main")
	String main;

	@JsonProperty("description")
	String description;
	
	@JsonProperty("icon")
	String icon;

	@Override
	public String toString() {
		return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
	}
	
	
}
