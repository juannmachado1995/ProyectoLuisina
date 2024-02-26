package com.dh.Xplorando;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(BackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
		LOGGER.info("Xplorando está corriendo ...");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}



}

