package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {
	@Autowired
	private GreetingFeignClient greetingClient;

	@RequestMapping("/get-greeting")
	public String greeting() {
		return greetingClient.greeting() + " returned by feign client";
	}
}
