package com.wuchaooooo.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClient1Application.class, args);
	}
}
