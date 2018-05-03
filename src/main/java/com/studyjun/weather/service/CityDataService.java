package com.studyjun.weather.service;

import com.studyjun.weather.vo.City;
import com.studyjun.weather.vo.County;

import java.util.List;

public interface CityDataService {

    List<City> getCities(String province)throws Exception;

    List<County> getCounties(String city )throws Exception;
}
