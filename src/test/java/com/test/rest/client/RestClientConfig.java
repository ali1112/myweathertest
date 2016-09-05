package com.test.rest.client;

import org.springframework.stereotype.Component;

@Component
public class RestClientConfig {

	String url = "http://api.openweathermap.org/data";
	String appid = "e7a246e7a2b3a73ea93879ddccc729c9";
	String version = "2.5";
	Integer connectionTimeout;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public Integer getConnectionTimeout() {
		return connectionTimeout;
	}
	public void setConnectionTimeout(Integer connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}
