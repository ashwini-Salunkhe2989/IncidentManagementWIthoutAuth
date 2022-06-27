package com.finleap.incidentManagement.incidentupdation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finleap.incidentManagement.incidentupdation.model.IncidentDetails;

@Repository
public interface IncidentDetailsUpdateRepository extends CrudRepository<IncidentDetails, Integer> {

}
