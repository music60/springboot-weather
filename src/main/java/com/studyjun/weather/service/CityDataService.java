package com.studyjun.weather.service;

import com.studyjun.weather.vo.City;
import com.studyjun.weather.vo.County;

import java.util.List;

public interface CityDataService {

    /**
     * 获取该省的城市，
     * 注意格式<广东>，不要写<广东省>
     * @param province
     * @return
     * @throws Exception
     */
    List<City> getCities(String province)throws Exception;

    List<County> getCounties(String city )throws Exception;
}
