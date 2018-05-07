package com.studyjun.weather.controller;

import com.studyjun.weather.service.CityDataService;
import com.studyjun.weather.service.WeatherDataService;
import com.studyjun.weather.vo.City;
import com.studyjun.weather.vo.County;
import com.studyjun.weather.vo.Weather;
import com.studyjun.weather.vo.WeatherComCnResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {



    @Autowired
    WeatherDataService weatherDataService;

    @Autowired
    CityDataService cityDataService;

    @GetMapping("/cityname/{cityname}")
    public WeatherComCnResponseEntity<Weather> getWeatherByName(@PathVariable("cityname")String cityName){
        return weatherDataService.getWeatherByCityName(cityName);
    }


    @GetMapping("/province/citylist/{name}")
    public List<City> getCityListByProvinceName(@PathVariable("name")String name) throws Exception {
        return cityDataService.getCities(name);
    }

    @GetMapping("/province/city/countylist/{name}")
    public List<County> getCountyListByCityName(@PathVariable("name")String name) throws Exception {
        return cityDataService.getCounties(name);
    }
}
