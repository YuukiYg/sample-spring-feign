package com.yuukiyg.sample.feign.samplefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuukiyg.sample.feign.samplefeign.model.CurrentWeather;

@FeignClient(value = "weatherApi", url = "http://api.openweathermap.org/data/2.5")
public interface WeatherFeignClient {

	@RequestMapping(method=RequestMethod.GET, value="weather", produces = "application/json")
	CurrentWeather getCurrentWeather(@RequestParam("q") String cityName, @RequestParam("APPID")String appKey);

}