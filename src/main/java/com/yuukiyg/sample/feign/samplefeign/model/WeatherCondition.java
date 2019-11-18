 package com.yuukiyg.sample.feign.samplefeign.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WeatherCondition {
	private int id;    // 空模様を表すID
	private String main;  // 空模様パラメータのグループ(Rain, Snow, Extreme, など）
	private String description;  //グループ内の空模様
	private String icon;  //空模様を表すアイコン
}
