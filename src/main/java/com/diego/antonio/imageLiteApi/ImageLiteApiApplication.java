package com.diego.antonio.imageLiteApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImageLiteApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageLiteApiApplication.class, args);
	}

}
