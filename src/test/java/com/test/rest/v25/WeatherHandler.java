package com.test.rest.v25;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.test.entity.RestResponse;
import com.test.entity.WeatherResponse;
import com.test.rest.client.RestClient;
import com.test.rest.client.RestClientConfig;

@Component
public class WeatherHandler {

	@Autowired
	RestClient restClient;
	
	@Autowired
	RestClientConfig restClientConfig;
	
	String version="2.5";
	
	public void executeGetCall(){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("q", "Delhi");
		RestResponse restResponse = restClient.callGet("weather", map);
		if(restResponse.getResponse().getStatus() == 200){
			WeatherResponse weatherResponse = restResponse.getResponse().readEntity(WeatherResponse.class);
			System.out.println(weatherResponse.toString());
		}
		
	}
	
	public static void main(String args[]){
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		 WeatherHandler weatherHandler = ctx.getBean("weatherHandler", WeatherHandler.class);

		 weatherHandler.executeGetCall();
	}
	
}
