package com.yuukiyg.sample.feign.samplefeign.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Coordinate {
	private long lon; // 緯度
	private long lat; // 経度
}
