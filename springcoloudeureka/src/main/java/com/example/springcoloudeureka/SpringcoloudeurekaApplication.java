package com.example.springcoloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcoloudeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoloudeurekaApplication.class, args);
	}

}
