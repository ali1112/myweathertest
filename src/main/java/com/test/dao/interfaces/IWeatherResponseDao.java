package com.test.dao.interfaces;

import org.springframework.stereotype.Component;

import com.test.dao.entity.WeatherResponseDao;

@Component
public interface IWeatherResponseDao {

	public void insertWeatherResponse(WeatherResponseDao weatherResponse);
	
	public WeatherResponseDao getWeatherResponse(Integer id);
}
