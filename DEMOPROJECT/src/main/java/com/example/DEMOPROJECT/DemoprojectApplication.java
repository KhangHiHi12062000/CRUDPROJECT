package com.example.DEMOPROJECT;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.DEMOPROJECT.models.Users;
import com.example.DEMOPROJECT.repository.UserRepository;

@SpringBootApplication
public class DemoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoprojectApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return args -> {
			
		
		};
		
	}
	
}
