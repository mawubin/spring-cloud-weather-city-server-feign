package com.wuyuan.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuyuan.spring.cloud.weather.service.CityData;
/**
 * Hello Controller.
 * 
 * @since 1.0.0 2017年11月20日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
public class CityController {
	
	@Autowired
	private CityData citydata;
	//@RequestMapping("/hello")
	@GetMapping("/citydata")
	public String getCityData() {
		return citydata.listCity(); 
	}
}
