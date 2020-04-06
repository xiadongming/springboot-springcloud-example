package com.example.demo.iserver.fallback;

import org.springframework.stereotype.Component;

import com.example.demo.iserver.GreetingServer;

@Component
public class GreetingServerFallback implements GreetingServer {

	@Override
	public String greeting(String name) {

		return "error  " + name;
	}

}
