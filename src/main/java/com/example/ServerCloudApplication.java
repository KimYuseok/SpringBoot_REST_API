package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan를 포함
public class ServerCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerCloudApplication.class, args);
	}

}

