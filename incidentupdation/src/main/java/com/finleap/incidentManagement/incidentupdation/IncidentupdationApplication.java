package com.finleap.incidentManagement.incidentupdation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.finleap.incidentManagement.incidentupdation.repository")
@ComponentScan({"com.finleap.incidentManagement.incidentupdation.controller",
				"com.finleap.incidentManagement.incidentupdation.service","com.finleap.incidentManagement.UserManagement","com.finleap.incidentManagement.Exception"})
@EntityScan("com.finleap.incidentManagement.incidentupdation.model")
@EnableEurekaClient
public class IncidentupdationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncidentupdationApplication.class, args);
	}

}
