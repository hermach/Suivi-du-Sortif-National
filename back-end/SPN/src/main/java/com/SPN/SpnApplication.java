package com.SPN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing 
public class SpnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpnApplication.class, args);
	}

}
