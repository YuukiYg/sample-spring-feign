package com.yuukiyg.sample.feign.samplefeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yuukiyg.sample.feign.samplefeign.client.WeatherFeignClient;
import com.yuukiyg.sample.feign.samplefeign.model.CurrentWeather;

@Service
public class FeignClientServiceImpl implements FeignClientService{

	@Autowired
	WeatherFeignClient feignClient;

	@Value("${openweathermap.appkey:}")
	private String appKey;

	@Override
	public void execute() {
		if(appKey != null && !appKey.equals("")) {
			CurrentWeather currentWeather = feignClient.getCurrentWeather("Tokyo", appKey);
			System.out.println(currentWeather.toString());
		}
	}

}
