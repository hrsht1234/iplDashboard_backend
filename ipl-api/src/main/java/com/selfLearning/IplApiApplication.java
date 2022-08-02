package com.selfLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IplApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplApiApplication.class, args);
	}

}
