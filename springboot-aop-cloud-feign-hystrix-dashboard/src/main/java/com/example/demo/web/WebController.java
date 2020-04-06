package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.iserver.GreetingServer;

@RestController
public class WebController {

	@Autowired
	private GreetingServer server;
	
	@Value("${server.port}")
	private String port;
	
	
	@RequestMapping("/greet")
	public String webController() {
		String greeting = server.greeting("笑笑笑");
		
		greeting += ",through feign-hystrix server from port " +port;
		
		return greeting;
	}
	
	
}



