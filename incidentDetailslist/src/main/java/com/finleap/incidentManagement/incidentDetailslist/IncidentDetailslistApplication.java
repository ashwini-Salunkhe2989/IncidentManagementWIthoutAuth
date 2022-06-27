package com.finleap.incidentManagement.incidentDetailslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.finleap.incidentManagement.incidentDetailslist.repository")
@ComponentScan("com.finleap.incidentManagement.incidentDetailslist.controller")
@EntityScan("com.finleap.incidentManagement.incidentDetailslist.model")
@EnableEurekaClient
public class IncidentDetailslistApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncidentDetailslistApplication.class, args);
	}

}
