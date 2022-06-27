package com.finleap.incidentManagement.incidentupdation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finleap.incidentManagement.Exception.IncidentManagementCustomException;
import com.finleap.incidentManagement.incidentupdation.model.IncidentDetails;
import com.finleap.incidentManagement.incidentupdation.repository.IncidentDetailsUpdateRepository;

@Service
public class IncidentDetailsUpdateService {
	@Autowired
	private IncidentDetailsUpdateRepository incidentDetailsUpdateRepository;

	public IncidentDetails save(IncidentDetails incident,String headerUserid) {
	
		Optional<IncidentDetails> existingincident= incidentDetailsUpdateRepository.findById(incident.getIncidentid());
		IncidentDetails updatedincident = null;
		
		if(existingincident.isPresent()&& (existingincident.get().getCreatedBy().equalsIgnoreCase(headerUserid)
			|| existingincident.get().getAssignee().equalsIgnoreCase(headerUserid))) {
			
			incident.setIncidentid(existingincident.get().getIncidentid());
			updatedincident = incidentDetailsUpdateRepository.save(incident);
		}
		else {
			throw new IncidentManagementCustomException("You cant update this incident. You must be creator or assignee to update incident");
		}
		
		return updatedincident;
	}
	
}
