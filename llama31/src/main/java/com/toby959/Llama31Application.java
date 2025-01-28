package com.toby959;

import com.toby959.functions.WeatherConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(WeatherConfigProperties.class)
@SpringBootApplication
public class Llama31Application {

	public static void main(String[] args) {
		SpringApplication.run(Llama31Application.class, args);
	}

}
