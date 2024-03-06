package com.application.gestorPeliculas.laApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages="com.application.gestorPeliculas.laApi.entities")
@SpringBootApplication
public class LaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaApiApplication.class, args);
	}

}
