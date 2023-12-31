package com.destination.carServiceProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.destination.carServiceProject.Repository")
@ComponentScan(basePackages = "com.destination.carServiceProject")
public class CarServiceApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CarServiceApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

}
