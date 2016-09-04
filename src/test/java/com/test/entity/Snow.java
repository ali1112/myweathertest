package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

	@JsonProperty("3h")
	Integer snow3h;

	public Integer getSnow3h() {
		return snow3h;
	}

	public void setSnow3h(Integer snow3h) {
		this.snow3h = snow3h;
	}
	
}
