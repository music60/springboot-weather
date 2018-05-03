package com.studyjun.weather.service.impl;

import com.studyjun.weather.service.CityDataService;
import com.studyjun.weather.utils.XMLBuilder;
import com.studyjun.weather.vo.City;
import com.studyjun.weather.vo.Country;
import com.studyjun.weather.vo.County;
import com.studyjun.weather.vo.Province;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.List;

@Service
public class CityDataServiceImpl implements CityDataService{
    @Override
    public List<City> getCities(String province) throws Exception{
        Resource resource =new  ClassPathResource("static/citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(),"utf-8"));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line=br.readLine())!=null){
            sb.append(line);
        }

        if (br!=null){
            br.close();
        }

        List<City> cities = null;
        Country country = (Country) XMLBuilder.xml2Object(Country.class,sb.toString());
        for (Province p:country.getProvinces()) { //遍历省份
            if (province.equals(p.getName())){
                cities =p.getCities();
                break;
            }

        }

        return cities;
    }

    @Override
    public List<County> getCounties(String city) throws Exception{
        Resource resource =new  ClassPathResource("static/citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(),"utf-8"));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line=br.readLine())!=null){
            sb.append(line);
        }

        if (br!=null){
            br.close();
        }

        List<County> cities = null;
        Country country = (Country) XMLBuilder.xml2Object(Country.class,sb.toString());
        FIND:for (Province province:country.getProvinces()) { //遍历省份
            for (City cty:province.getCities()){ //遍历城市
                if (city.equals(cty.getName())){
                    cities =cty.getCounties();
                    break FIND;
                }
            }
        }

        return cities;
    }
}
