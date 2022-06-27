package com.finleap.incidentManagement.incidentupdation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finleap.incidentManagement.incidentupdation.model.UserDetails;
import com.finleap.incidentManagement.incidentupdation.repository.UserDetailsRepository;

@Service
public class UserManagementService {

	@Autowired UserDetailsRepository userDetailsRepository;
	
	public UserDetails save(UserDetails userDetails) {
		
		UserDetails user = userDetailsRepository.save(userDetails);
		return user;
	}

	public UserDetails updateUser(UserDetails userDetails) {
		
			UserDetails user = userDetailsRepository.save(userDetails);
				
		return user;
	}
	
	
	public void deleteUser(String userId) {
		
		userDetailsRepository.deleteById(userId);
	}
	
	public Optional<UserDetails> getUserDetails(String userId) {		
		Optional<UserDetails> user= userDetailsRepository.findById(userId);
		return user;
	}

	
}
