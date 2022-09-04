package com.apigateway.apiGatewayDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}
}
