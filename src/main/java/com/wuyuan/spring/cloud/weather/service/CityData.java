package com.wuyuan.spring.cloud.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("weather-city-server-eureka")
//@FeignClient(value="weather-city-server-eureka")
public interface CityData {
	@GetMapping("/cities")
	String listCity();
}
