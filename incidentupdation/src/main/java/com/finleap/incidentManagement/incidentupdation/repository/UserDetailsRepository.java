package com.finleap.incidentManagement.incidentupdation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finleap.incidentManagement.incidentupdation.model.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {

}
