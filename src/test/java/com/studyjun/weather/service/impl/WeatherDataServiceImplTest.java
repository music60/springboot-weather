package com.studyjun.weather.service.impl;

import com.studyjun.weather.vo.WeatherComCnResponseEntity;
import com.studyjun.weather.vo.Weather;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WeatherDataServiceImplTest {

    @Autowired
    WeatherDataServiceImpl weatherDataService;

    @Test
    public void getWeatherByCityName() {
        WeatherComCnResponseEntity<Weather> weather = weatherDataService.getWeatherByCityName("深圳");
        System.out.println(weather.getData().toString());
        assertNotEquals(null,weather);
    }

    @Test
    public void getWeatherByCityKey() {
    }
}