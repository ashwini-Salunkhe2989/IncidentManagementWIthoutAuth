package com.finleap.incidentManagement.UserManagement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finleap.incidentManagement.Exception.IncidentManagementCustomException;
import com.finleap.incidentManagement.incidentupdation.model.UserDetails;
import com.finleap.incidentManagement.incidentupdation.service.UserManagementService;

import io.micrometer.core.annotation.Timed;

@RestController
public class UserManagementController {

	@Autowired
	private UserManagementService userManagementService;

	@PostMapping("/addUser")
	@Timed(value = "updateIncident.time", description = "Time taken to update Incident")
	public UserDetails addUser(@RequestBody UserDetails userDetails) {

		UserDetails Userdetails = userManagementService.save(userDetails);

		return Userdetails;
	}

	@PutMapping("/updateuser")
	@Timed(value = "updateIncident.time", description = "Time taken to update Incident")
	public UserDetails updateUser(@RequestBody UserDetails userDetails) {

		UserDetails Userdetails = userManagementService.save(userDetails);

		return Userdetails;
	}

	@DeleteMapping("/deleteuser/{userId}")
	@Timed(value = "deleteuser.time", description = "Time taken to deleteuser ")
	public void deleteUser(@PathVariable String userId) {

		userManagementService.deleteUser(userId);

	}

	@GetMapping("/getuser/{userId}")
	@Timed(value = "getuser.time", description = "Time taken to getuser ")
	public UserDetails getUserDetails(@PathVariable String userId) {

		Optional<UserDetails> userdetails = userManagementService.getUserDetails(userId);

		if (userdetails.isPresent()) {
			return userdetails.get();
		} else {
			throw new IncidentManagementCustomException("Incident Not Present");
		}

	}

}
