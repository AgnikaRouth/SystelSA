package com.example.otakudb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example")
@EnableAutoConfiguration

public class OtakudbApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtakudbApplication.class, args);
		System.out.println("Main function is running");
	}

}
