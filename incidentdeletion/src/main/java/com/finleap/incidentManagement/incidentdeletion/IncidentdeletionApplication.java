package com.finleap.incidentManagement.incidentdeletion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.finleap.incidentManagement.incidentdeletion.repository")
@ComponentScan("com.finleap.incidentManagement.incidentdeletion.controller")
@EntityScan("com.finleap.incidentManagement.incidentdeletion.model")
@EnableEurekaClient
public class IncidentdeletionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncidentdeletionApplication.class, args);
	}

}
