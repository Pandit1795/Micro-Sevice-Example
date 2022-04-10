package com.example.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ErServer111Application {

	public static void main(String[] args) {
		SpringApplication.run(ErServer111Application.class, args);

System.out.println("HIII Nikita");
	}

}
