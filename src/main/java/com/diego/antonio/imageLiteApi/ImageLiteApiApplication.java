package com.diego.antonio.imageLiteApi;

import com.diego.antonio.imageLiteApi.domain.entity.Image;
import com.diego.antonio.imageLiteApi.infra.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImageLiteApiApplication {

	@Builder
	@Bean
	public CommandLineRunner commandLineRunner(@Autowired ImageRepository repository) {
		return args -> {
			Image image = Image
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ImageLiteApiApplication.class, args);
	}

}
