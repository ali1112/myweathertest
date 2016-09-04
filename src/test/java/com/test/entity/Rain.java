package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

	@JsonProperty("3h")
	Integer rain3h;

	public Integer getRain3h() {
		return rain3h;
	}

	public void setRain3h(Integer rain3h) {
		this.rain3h = rain3h;
	}
	
	
}
