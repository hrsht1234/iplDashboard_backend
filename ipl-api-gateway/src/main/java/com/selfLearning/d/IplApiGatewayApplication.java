package com.selfLearning.d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class IplApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplApiGatewayApplication.class, args);
	}

	   @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}
