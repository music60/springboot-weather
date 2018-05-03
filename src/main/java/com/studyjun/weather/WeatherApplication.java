package com.studyjun.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}


	/**
	 * 提供请求服务
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());

		StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("utf-8"));
		restTemplate.getMessageConverters().add(1,m);
		RestTemplate restTemplate1 = new RestTemplateBuilder().additionalMessageConverters(m).build();
		return restTemplate;
	}

//	/**
//	 * 提供请求服务
//	 * @return
//	 */
//	@Bean
//	public StringRedisTemplate redisTemplate() {
//
//		StringRedisTemplate restTemplate = new StringRedisTemplate(jedisConnectionFactory);
//
//		return restTemplate;
//	}

}
