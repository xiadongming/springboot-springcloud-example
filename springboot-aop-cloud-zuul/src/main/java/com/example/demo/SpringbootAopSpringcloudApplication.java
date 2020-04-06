package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class SpringbootAopSpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopSpringcloudApplication.class, args);
	}

}
