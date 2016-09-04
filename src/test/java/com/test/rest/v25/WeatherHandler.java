package com.test.rest.v25;

import java.util.HashMap;
import java.util.Map;

import com.test.entity.RestClientConfig;
import com.test.entity.RestResponse;
import com.test.entity.WeatherResponse;
import com.test.rest.client.RestClient;

public class WeatherHandler {

	RestClient restClient;
	
	String version="2.5";
	
	public void executeGetCall(){
		restClient = new RestClient();
		RestClientConfig restClientConfig = new RestClientConfig();
		restClientConfig.setVersion(version);
		restClient.setRestClientConfig(restClientConfig);
		Map<String, String> map = new HashMap<String, String>();
		map.put("q", "Delhi");
		RestResponse restResponse = restClient.callGet("weather", map);
		if(restResponse.getResponse().getStatus() == 200){
			WeatherResponse weatherResponse = restResponse.getResponse().readEntity(WeatherResponse.class);
			System.out.println(weatherResponse.toString());
		}
		
	}
	
	public static void main(String args[]){
		WeatherHandler w = new WeatherHandler();
		w.executeGetCall();
	}
	
}
