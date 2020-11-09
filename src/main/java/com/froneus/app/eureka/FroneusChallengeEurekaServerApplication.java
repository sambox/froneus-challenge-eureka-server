package com.froneus.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FroneusChallengeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FroneusChallengeEurekaServerApplication.class, args);
	}

}
