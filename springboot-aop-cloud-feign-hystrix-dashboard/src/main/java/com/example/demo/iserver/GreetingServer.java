package com.example.demo.iserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.iserver.fallback.GreetingServerFallback;
@FeignClient(value="springcloud-eureka-client",fallback = GreetingServerFallback.class)
public interface GreetingServer {
	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public String greeting(@RequestParam(value = "name")  String name) ;
	
}
