package com.studyjun.weather.config;


import com.studyjun.weather.job.WeatherSyncJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherSyncJobConfig {

    @Bean
    public JobDetail getWeatherSyncJobDetail(){
        return JobBuilder.newJob(WeatherSyncJob.class).withIdentity("weatherSyncSchedulerJobDetail").storeDurably().build();
    }

    @Bean
    public Trigger getWeatherSyncJobTrigger(){
         SimpleScheduleBuilder scheduler= SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(500000).repeatForever();
        return TriggerBuilder.newTrigger().forJob(getWeatherSyncJobDetail()).withIdentity("weatherSyncJobTrigger").withSchedule(scheduler).build();
    }

}
