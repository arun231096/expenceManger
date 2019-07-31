package com.sasurie.student.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExpenceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenceManagementApplication.class, args);
	}

}
