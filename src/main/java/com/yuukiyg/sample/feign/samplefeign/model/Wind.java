package com.yuukiyg.sample.feign.samplefeign.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Wind {
	private long speed;  //風速
	private long deg;  //風向
}
