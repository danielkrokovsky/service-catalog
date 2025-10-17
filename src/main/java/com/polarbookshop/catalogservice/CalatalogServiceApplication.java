package com.polarbookshop.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class CalatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalatalogServiceApplication.class, args);
	}

}
