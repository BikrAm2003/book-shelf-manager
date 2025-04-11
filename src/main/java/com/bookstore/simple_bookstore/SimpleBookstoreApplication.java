package com.bookstore.simple_bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.bookstore")
public class SimpleBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBookstoreApplication.class, args);
	}

}
