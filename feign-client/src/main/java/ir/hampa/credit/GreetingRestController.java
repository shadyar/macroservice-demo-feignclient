package ir.hampa.credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GreetingRestController {
	@Autowired
	private GreetingFeignClient greetingClient;

	@RequestMapping("/get-greeting")
	public String greeting() {
		log.info("Hello word passed to Feign Client Service from Greeting Service, returned by {}", this.getClass().getName());
		return greetingClient.greeting() + " returned by feign client";
	}
}
