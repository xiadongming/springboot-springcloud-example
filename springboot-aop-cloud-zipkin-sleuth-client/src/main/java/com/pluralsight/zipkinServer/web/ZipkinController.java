package com.pluralsight.zipkinServer.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class ZipkinController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/html")
	public String getController() {
		logger.info("=====111111======");
		
		System.out.println("========zipkin日志信息============");
		return "success";
	}

}
