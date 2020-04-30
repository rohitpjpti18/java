package com.piedpiper.pipedpiper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PipedPiperApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipedPiperApplication.class, args);
	}

}
