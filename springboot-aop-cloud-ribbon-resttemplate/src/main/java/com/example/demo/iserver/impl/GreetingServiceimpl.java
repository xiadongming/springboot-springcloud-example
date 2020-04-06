package com.example.demo.iserver.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.iserver.GreetingServer;
@Service
public class GreetingServiceimpl implements GreetingServer{
    @Autowired
	private RestTemplate  restTemplate;
	
	@Override
	public String greeting(String name) {
		return restTemplate.getForObject("http://springcloud-eureka-client/sayHello?name= "+name,String.class);
	}

}
