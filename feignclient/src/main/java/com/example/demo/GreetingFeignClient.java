package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("greeting-service")
	public interface GreetingFeignClient {
	    @RequestMapping("/greeting")
	    String greeting();
}
