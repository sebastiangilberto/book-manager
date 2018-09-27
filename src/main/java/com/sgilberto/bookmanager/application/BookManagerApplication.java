package com.sgilberto.bookmanager.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sgilberto.bookmanager")
@EntityScan("com.sgilberto.bookmanager.entity")
@EnableJpaRepositories("com.sgilberto.bookmanager.repository")
public class BookManagerApplication {

	public static void main(final String[] args) {
		SpringApplication.run(BookManagerApplication.class, args);
	}

}
