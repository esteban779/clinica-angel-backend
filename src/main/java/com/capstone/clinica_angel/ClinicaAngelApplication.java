package com.capstone.clinica_angel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.capstone")
public class ClinicaAngelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaAngelApplication.class, args);
	}

}
