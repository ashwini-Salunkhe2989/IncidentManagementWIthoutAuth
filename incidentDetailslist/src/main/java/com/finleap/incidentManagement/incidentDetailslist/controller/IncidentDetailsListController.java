package com.finleap.incidentManagement.incidentDetailslist.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.incidentDetailslist.model.IncidentDetails;
import com.finleap.incidentManagement.incidentDetailslist.repository.IncidentDetailsListRepository;

import io.micrometer.core.annotation.Timed;

@RestController
public class IncidentDetailsListController {

	@Autowired
	private IncidentDetailsListRepository incidentDetailsListRepository;
	
	Logger logger = LoggerFactory.getLogger(IncidentDetailsListController.class);
	
	@GetMapping("/getIncidentReport/{id}")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public Optional<IncidentDetails> getIncidentReport(@PathVariable int id) {
		logger.debug("getIncidentReport method"+id);
		Optional<IncidentDetails> incident = incidentDetailsListRepository.findById(id);

		return incident;
	}

	@GetMapping("/getAllIncidentsReport")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public List<IncidentDetails> getAllIncidents() {
		
		logger.debug("getAllIncidentsReport method");
		Iterable<IncidentDetails> incident = incidentDetailsListRepository.findAll();
		List<IncidentDetails> result = new ArrayList<IncidentDetails>();

		incident.forEach(result::add);

		return result;

	}

	@GetMapping("/getIncidentReportByAssignee/{assignee}")
	@Timed(value = "deleteIncident.time", description = "Time taken to delete Incident")
	public List<IncidentDetails> getIncidentReportByAssiginee(@PathVariable String assignee) {

		logger.debug("getIncidentReportByAssignee method"+assignee);
		List<IncidentDetails> incident = incidentDetailsListRepository.findByAssignee(assignee);

		return incident;
	}

}
