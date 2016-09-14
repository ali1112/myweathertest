package com.test.utils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import com.test.dao.entity.WeatherConditionsDaoObj;
import com.test.dao.entity.WeatherResponseDao;
import com.test.entity.Clouds;
import com.test.entity.Coordinates;
import com.test.entity.MainWeather;
import com.test.entity.Rain;
import com.test.entity.Snow;
import com.test.entity.Sys;
import com.test.entity.Weather;
import com.test.entity.WeatherResponse;
import com.test.entity.Wind;

public class TranslationUtil {

	public static WeatherResponseDao getWeatherResponseDao(WeatherResponse weatherResponse){
		WeatherResponseDao weatherResponseDao = new WeatherResponseDao();
		weatherResponseDao.setLocaltionId(weatherResponse.getId());
		weatherResponseDao.setLocationName(weatherResponse.getName());
		Coordinates coordinates = weatherResponse.getCoord();
		if(coordinates != null){
			weatherResponseDao.setCoordLat(coordinates.getLat());
			weatherResponseDao.setCoordLon(coordinates.getLon());
		}
		Rain rain = weatherResponse.getRain();
		if(rain != null){
			weatherResponseDao.setRain3h(rain.getRain3h());
		}
		
		Snow snow = weatherResponse.getSnow();
		if(snow != null){
			weatherResponseDao.setSnow3h(snow.getSnow3h());
		}
		
		Clouds clouds = weatherResponse.getClouds();

		if(clouds != null){
			weatherResponseDao.setClouds3h(clouds.getCloudsAll());
		}
		
		Wind wind = weatherResponse.getWind();
		if(wind != null ){
			weatherResponseDao.setWindSpeed(wind.getSpeed());
			weatherResponseDao.setWindDeg(wind.getDeg());

		}
		
		Sys sys = weatherResponse.getSys();
		
		if(sys != null){
			weatherResponseDao.setCountry(sys.getCountry());
			weatherResponseDao.setSunrise(new Timestamp(sys.getSunrise().getMillis()));
			weatherResponseDao.setSunset(new Timestamp(sys.getSunset().getMillis()));
		}
		
		MainWeather mainWeather = weatherResponse.getMainWeather();
		
		if(mainWeather != null){
			weatherResponseDao.setTemp(mainWeather.getTemp());
			weatherResponseDao.setTempMax(mainWeather.getTempMax());
			weatherResponseDao.setTempMin(mainWeather.getTempMin());
			weatherResponseDao.setHumidity(mainWeather.getHumidity());
			weatherResponseDao.setPressure(mainWeather.getPressure());
		}
		
		weatherResponseDao.setDate(new Timestamp(weatherResponse.getDate().getMillis()));
		weatherResponseDao.setWeatherReuestDate(new Timestamp((new DateTime().getMillis())));
		return weatherResponseDao;
		
	}
	
	/*public static WeatherConditionsDaoObj getWetherMainDaoObj(MainWeather mainWeather){
		WeatherConditionsDaoObj weatherMainDaoObj = new WeatherConditionsDaoObj();
		weatherMainDaoObj.setTemp(mainWeather.getTemp());
		weatherMainDaoObj.setHumidity(mainWeather.getHumidity());
		weatherMainDaoObj.setPressure(mainWeather.getPressure());
		weatherMainDaoObj.setTempMax(mainWeather.getTempMax());
		weatherMainDaoObj.setTempMin(mainWeather.getTempMin());
		return weatherMainDaoObj;
	}*/
	
	public static List<WeatherConditionsDaoObj> getWeatherConditionsDaoObjs(Weather [] weather){
		List<WeatherConditionsDaoObj> weatherConditionsDaoObjs = new ArrayList<WeatherConditionsDaoObj>();
		if(weather != null){
			for(Weather weatherCondition :weather  ){
				WeatherConditionsDaoObj weatherConditionsDaoObj = new WeatherConditionsDaoObj();
				weatherConditionsDaoObj.setDescription(weatherCondition.getDescription());
				weatherConditionsDaoObj.setIcon(weatherCondition.getIcon());
				weatherConditionsDaoObj.setMain(weatherCondition.getMain());
				weatherConditionsDaoObjs.add(weatherConditionsDaoObj);
			}
		}	
		
		return weatherConditionsDaoObjs;
	}
	
}
