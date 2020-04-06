package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.iserver.GreetingServer;


//@EnableHystrix,,feign和hystrix整合以后，不用写EnableHystrix注解
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(clients = GreetingServer.class)
@EnableHystrixDashboard
public class SpringbootAopSpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopSpringcloudApplication.class, args);
	}

}
