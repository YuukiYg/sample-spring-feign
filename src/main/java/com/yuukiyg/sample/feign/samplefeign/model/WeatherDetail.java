package com.yuukiyg.sample.feign.samplefeign.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WeatherDetail {
	private long temp;     //温度
	private long pressure; //気圧
	private long humidity; //湿度
	private long temp_min; //最低気温
	private long temp_max; //最高気温
	// sea_levelやgrnd_levelは省略
}
