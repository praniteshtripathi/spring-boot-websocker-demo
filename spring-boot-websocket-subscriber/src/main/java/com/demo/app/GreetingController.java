package com.demo.app;

import java.util.Random;

import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    
	@SubscribeMapping("/topic/greeting")
	@Scheduled(fixedDelay = 1000)
	public Greeting greeting1() throws Exception {
		Thread.sleep(1000); // simulated delay
		HelloMessage message= new HelloMessage();
		Random random= new Random();
		message.setName("Amit kumar "+random.nextInt());
		System.out.println("----------------------------------"+message.getName());
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
