package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
//	@PutMapping("/{id}")
//	public User updateUser(
//	        @PathVariable Long id,
//	        @RequestBody User userDetails) {
//	    
//	    // Find the user by id
//	    User user = userRepository.findById(id)
//	            .orElseThrow(() -> new RuntimeException("User not found with id " + id));
//
//	    // Update the fields
//	    user.setFirstName(userDetails.getFirstName());
//	    user.setLastName(userDetails.getLastName());
//	    user.setEmail(userDetails.getEmail());
//
//	    // Save updated user
//	    return userRepository.save(user);
//	}

}