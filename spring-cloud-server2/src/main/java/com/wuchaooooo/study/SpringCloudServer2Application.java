package com.wuchaooooo.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer2Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer2Application.class, args);
	}
}
