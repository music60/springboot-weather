package com.studyjun.weather.service.impl;

import com.studyjun.weather.vo.City;
import com.studyjun.weather.vo.Country;
import com.studyjun.weather.vo.County;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityDataServiceImplTest {

    @Autowired
    CityDataServiceImpl cityDataService;


    @Test
    public void getCities() throws Exception {
        List<City> cities = cityDataService.getCities("广东");
        System.out.println(cities);
        assertNotEquals(null,cities);
    }

    @Test
    public void getCounties() throws Exception {
        List<County> cities = cityDataService.getCounties("广州");
        System.out.println(cities);
        assertNotEquals(null,cities);
    }
}