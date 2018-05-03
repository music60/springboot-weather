package com.studyjun.weather.job;

import com.studyjun.weather.service.WeatherDataService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class WeatherSyncJob extends QuartzJobBean {

    private static final Logger logger= LoggerFactory.getLogger(WeatherDataService.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        logger.info("调度器：quartz excute!");
    }
}
