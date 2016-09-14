package com.test.rest.v25;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.test.dao.entity.WeatherResponseDao;
import com.test.dao.interfaces.IWeatherResponseDao;
import com.test.entity.RestResponse;
import com.test.entity.WeatherResponse;
import com.test.rest.client.RestClient;
import com.test.rest.client.RestClientConfig;
import com.test.utils.TranslationUtil;

@Component
public class WeatherHandler {

	@Autowired
	RestClient restClient;
	
	@Autowired
	RestClientConfig restClientConfig;
	
	String version="2.5";
	
	public WeatherResponse executeGetCall(){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("q", "Delhi");
		RestResponse restResponse = restClient.callGet("weather", map);
		if(restResponse.getResponse().getStatus() == 200){
			WeatherResponse weatherResponse = restResponse.getResponse().readEntity(WeatherResponse.class);
			System.out.println(weatherResponse.toString());
			return weatherResponse;
		}
		return null;
		
	}
	
	/*public static void main(String args[]){
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		 WeatherHandler weatherHandler = ctx.getBean("weatherHandler", WeatherHandler.class);
		 
		 IWeatherResponseDao iWeatherResponseDao = ctx.getBean("iWeatherResponseDao", IWeatherResponseDao.class);
		 
		 WeatherResponse weatherResponse = weatherHandler.executeGetCall();
		 
		 WeatherResponseDao weatherResponseDao = TranslationUtil.getWeatherResponseDao(weatherResponse);
		 
		 iWeatherResponseDao.insertWeatherResponse(weatherResponseDao);
		 
	}*/

	
}
