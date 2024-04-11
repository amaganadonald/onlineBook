package com.luxprojects.onlineBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
//@EnableJpaRepositories
@EnableR2dbcAuditing
@EnableR2dbcRepositories
public class OnlinBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinBookApplication.class, args);
	}

}
