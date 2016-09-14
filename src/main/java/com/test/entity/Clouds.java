package com.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Clouds {

	@JsonProperty("all")
	float cloudsAll;

	public float getCloudsAll() {
		return cloudsAll;
	}

	public void setCloudsAll(float cloudsAll) {
		this.cloudsAll = cloudsAll;
	}

	@Override
	public String toString() {
		return "Clouds [cloudsAll=" + cloudsAll + "]";
	}
	
	
	
	
}
