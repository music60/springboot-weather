package com.studyjun.weather.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.studyjun.weather.service.WeatherDataService;
import com.studyjun.weather.vo.WeatherComCnResponseEntity;
import com.studyjun.weather.vo.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {
    private static final Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    public static final String BASIC_URL="http://wthrcdn.etouch.cn/weather_mini?";//citykey //city
    private static final long TIME_OUT = 1800L ;

    @Autowired
    RestTemplate mRestTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @Override
    public WeatherComCnResponseEntity<Weather> getWeatherByCityName(String cityName) {
        String realUrl = BASIC_URL+"city="+cityName;
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String result =null;
        if (ops.get(realUrl)!=null){
            result=ops.get(realUrl);
            logger.info("redis has data!");
        } else { //没有缓存或缓存过期
            logger.info("redis has no data!");

            result = mRestTemplate.getForEntity(realUrl, String.class).getBody();
            ops.set(realUrl,result,TIME_OUT, TimeUnit.SECONDS);

        }
        WeatherComCnResponseEntity<Weather> weather = JSON.parseObject(result, new TypeReference<WeatherComCnResponseEntity<Weather>>() {
        }.getType());

        return weather;

    }

    @Override
    public WeatherComCnResponseEntity<Weather> getWeatherByCityKey(String cityKey) {
        String realUrl = BASIC_URL+"citykey="+cityKey;
        WeatherComCnResponseEntity<Weather> entry=mRestTemplate.exchange(realUrl, HttpMethod.GET, null, new ParameterizedTypeReference<WeatherComCnResponseEntity<Weather>>() {
        }).getBody();

        return entry;

    }
}
