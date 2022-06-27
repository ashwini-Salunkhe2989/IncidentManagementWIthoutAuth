package com.finleap.incidentManagement.incidentdeletion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.incidentdeletion.repository.DeleteIncidentRepository;

import io.micrometer.core.annotation.Timed;

@RestController
public class DeletionincidentController {
	
	@Autowired
	private DeleteIncidentRepository deleteIncidentRepository;
	Logger logger = LoggerFactory.getLogger(DeletionincidentController.class);
	
	@DeleteMapping("/deleteIncident/{id}")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public void createIncident(@PathVariable int id) {
		logger.debug("deleteIncident method for:"+id);
		deleteIncidentRepository.deleteById(id);
		
	}


}
