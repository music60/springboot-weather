package com.studyjun.weather.service;

import com.studyjun.weather.vo.WeatherComCnResponseEntity;
import com.studyjun.weather.vo.Weather;

public interface WeatherDataService {

    /**
     * 根据城市名称获取天气预报
     * @param cityName
     * @return
     */
    WeatherComCnResponseEntity<Weather> getWeatherByCityName(String cityName);


    /**
     * 根据城市key获取天气预报
     * @param cityKey
     * @return
     */
    WeatherComCnResponseEntity<Weather> getWeatherByCityKey(String cityKey);


}
