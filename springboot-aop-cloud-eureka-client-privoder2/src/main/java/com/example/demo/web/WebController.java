package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/sayHello")
	public String webController(String name) {
		
		
		return "hello, "+name + "from port " + port;
	}
	
	
}



