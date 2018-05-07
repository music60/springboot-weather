package com.studyjun.weather.job;

import com.studyjun.weather.service.CityDataService;
import com.studyjun.weather.service.WeatherDataService;
import com.studyjun.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class WeatherSyncJob extends QuartzJobBean {

    private static final Logger logger= LoggerFactory.getLogger(WeatherDataService.class);

    @Autowired
    CityDataService cityDataService;


    @Autowired
    WeatherDataService weatherDataService;


    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        List<City> cities;
        try {
            logger.info("执行天气查询:查询省份：广东");
            cities = cityDataService.getCities("广东");
            for (City c: cities) {
                logger.info("执行天气查询:正在缓冲城市天气："+c.getName());
                weatherDataService.getWeatherByCityName(c.getName()); //访问天气系统数据，并将结果写入到redis
            }
            logger.info("天气缓存完毕");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
