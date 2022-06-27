package com.finleap.incidentManagement.incidentcreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.finleap.incidentManagement.incidentcreation.repository")
@ComponentScan("com.finleap.incidentManagement.incidentcreation.controller")
@EntityScan("com.finleap.incidentManagement.incidentcreation.model")
@EnableEurekaClient
public class IncidentcreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncidentcreationApplication.class, args);
	}

}
