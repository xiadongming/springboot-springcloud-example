package com.pluralsight.zipkinServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinClientApplication {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(ZipkinClientApplication.class, args);
	}
}
