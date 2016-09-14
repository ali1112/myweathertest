package com.test.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.entity.WeatherConditionsDaoObj;
import com.test.dao.entity.WeatherResponseDao;
import com.test.dao.interfaces.IWeatherConditionsDao;
import com.test.dao.interfaces.IWeatherResponseDao;
import com.test.entity.WeatherResponse;
import com.test.rest.v25.WeatherHandler;
import com.test.utils.MybatisUtil;
import com.test.utils.TranslationUtil;

public class UpdateWeatherService {

	public static void main(String args[]){
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		 WeatherHandler weatherHandler = ctx.getBean("weatherHandler", WeatherHandler.class);
		 		 
		WeatherResponse weatherResponse = weatherHandler.executeGetCall();
		 
		 WeatherResponseDao weatherResponseDao = TranslationUtil.getWeatherResponseDao(weatherResponse);
		 List<WeatherConditionsDaoObj> weatherConditionsDaoObjs = TranslationUtil.getWeatherConditionsDaoObjs(weatherResponse.getWeather());
		 
		 
		// WeatherMainDaoObj we
		 
		 
		 SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		  try{
		  IWeatherResponseDao iWeatherResponseDao = sqlSession.getMapper(IWeatherResponseDao.class);
		  IWeatherConditionsDao iWeatherConditionsDao = sqlSession.getMapper(IWeatherConditionsDao.class);
		  iWeatherResponseDao.insertWeatherResponse(weatherResponseDao);
		  iWeatherConditionsDao.insertWeatherConditions(weatherConditionsDaoObjs.get(0));
		  
		  
		  sqlSession.commit();
		  //WeatherResponseDao weatherResponseDao2 = iWeatherResponseDao.getWeatherResponse(5);
		  }finally{
		   sqlSession.close();
		  }
		 
	} 
	
	public void updateWeather(){
		
	}
}
