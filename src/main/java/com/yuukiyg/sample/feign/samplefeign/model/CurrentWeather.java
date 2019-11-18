package com.yuukiyg.sample.feign.samplefeign.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CurrentWeather {
	/**
	 * 場所の名前
	 */
	private String name;

	/**
	 * 緯度・経度
	 */
	private Coordinate coord;

	/**
	 * 空模様（晴れ、くもりなど）
	 */
	private WeatherCondition[] weather;

	/**
	 * 詳細な気象データ（温度、湿度、気圧など）
	 */
	private WeatherDetail main;

	/**
	 * 風のデータ（風速、風向）
	 */
	private Wind wind;

	/**
	 * 雲量（空の全天に占める雲の割合 ％）
	 */
	private Cloudiness clouds;

	/**
	 * 視程（大気の見通し具合 メートル）
	 */
	private long visibility;
}
