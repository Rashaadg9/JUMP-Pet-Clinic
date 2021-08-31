package com.cognixia.jump.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JumpPetClinicEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(JumpPetClinicEx1Application.class, args);
	}

}
