package com.test.dao.interfaces;

import java.util.List;

import com.test.dao.entity.WeatherConditionsDaoObj;

public interface IWeatherConditionsDao {

	public void insertWeatherConditions(WeatherConditionsDaoObj weatherConditionsDaoObj);
	public List<WeatherConditionsDaoObj> getWeatherConditions();
}
