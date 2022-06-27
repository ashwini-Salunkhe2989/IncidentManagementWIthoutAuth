package com.finleap.incidentManagement.incidentcreation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.incidentcreation.model.IncidentDetails;
import com.finleap.incidentManagement.incidentcreation.repository.CreateIncidentRepository;

import io.micrometer.core.annotation.Timed;



@RestController
public class CreateIncidentController {
	
	@Autowired
	private CreateIncidentRepository createIncidentRepository;
	
	@PostMapping("/createIncident")
	@Timed(value = "createIncident.time", description = "Time taken to create Incident")
	public IncidentDetails createIncident(@RequestBody IncidentDetails customer) {
		
		IncidentDetails incidentcreated=createIncidentRepository.save(customer);
		System.out.println("incidentcreated"+incidentcreated.getAssignee());
		
		return incidentcreated;


	}

	
}
