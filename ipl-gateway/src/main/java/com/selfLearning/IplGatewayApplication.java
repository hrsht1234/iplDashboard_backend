package com.selfLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IplGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplGatewayApplication.class, args);
	}

}
