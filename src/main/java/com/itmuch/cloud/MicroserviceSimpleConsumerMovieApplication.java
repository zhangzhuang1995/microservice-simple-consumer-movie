package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceSimpleConsumerMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleConsumerMovieApplication.class, args);
	}

	@Bean//向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
