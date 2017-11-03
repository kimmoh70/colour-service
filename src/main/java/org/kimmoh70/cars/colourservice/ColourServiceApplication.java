package org.kimmoh70.cars.colourservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColourServiceApplication {

	@Autowired
	private ColourRepository colourRepository;

	public static void main(String[] args) {
		SpringApplication.run(ColourServiceApplication.class, args);
	}
}
