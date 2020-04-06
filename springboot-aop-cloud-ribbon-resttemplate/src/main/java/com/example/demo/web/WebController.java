package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.iserver.GreetingServer;

@RestController
public class WebController {

	@Autowired
	private GreetingServer server;
	
	@RequestMapping("/greet")
	public String webController() {
		
		
		return server.greeting("笑笑笑");
	}
	
	
}



