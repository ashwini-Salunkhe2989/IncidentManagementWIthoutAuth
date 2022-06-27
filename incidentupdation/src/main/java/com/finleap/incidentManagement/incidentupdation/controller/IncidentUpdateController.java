package com.finleap.incidentManagement.incidentupdation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.Exception.IncidentManagementCustomException;
import com.finleap.incidentManagement.incidentupdation.model.IncidentDetails;
import com.finleap.incidentManagement.incidentupdation.service.IncidentDetailsUpdateService;

import io.micrometer.core.annotation.Timed;

@RestController
public class IncidentUpdateController {
	
	
	
	@Autowired
	private IncidentDetailsUpdateService incidentDetailsUpdateService;
	
	@PutMapping("/updateIncident")
	@Timed(value = "updateIncident.time", description = "Time taken to update Incident")
	public IncidentDetails updateIncident(@RequestBody IncidentDetails incident, @RequestHeader("x-userid") String headerUserid) {
		IncidentDetails incidentupdated=null;
		
		try {
		 incidentupdated = incidentDetailsUpdateService.save(incident,headerUserid);
		}
		catch(IncidentManagementCustomException ex) {
			throw new IncidentManagementCustomException("You cant update this incident. You must be creator or assignee to update incident");
		}
		return incidentupdated;
	}
	
	
}
