package com.finleap.incidentManagement.incidentcreation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finleap.incidentManagement.incidentcreation.model.IncidentDetails;

@Repository
public interface CreateIncidentRepository extends CrudRepository<IncidentDetails, Long>  {
	
	
}
