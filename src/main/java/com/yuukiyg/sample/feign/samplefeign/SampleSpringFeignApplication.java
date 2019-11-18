package com.yuukiyg.sample.feign.samplefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import com.yuukiyg.sample.feign.samplefeign.service.FeignClientService;

@SpringBootApplication
@EnableFeignClients
public class SampleSpringFeignApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(
				SampleSpringFeignApplication.class, args);
        FeignClientService service = context.getBean(FeignClientService.class);
        service.execute();
	}

}

