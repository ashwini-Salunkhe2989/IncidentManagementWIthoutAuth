package com.finleap.incidentManagement.incidentdeletion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finleap.incidentManagement.incidentdeletion.model.IncidentDetails;

@Repository
public interface DeleteIncidentRepository extends CrudRepository<IncidentDetails,Integer>{

}
