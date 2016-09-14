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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
