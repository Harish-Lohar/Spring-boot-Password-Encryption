package com.password.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.password.dto.PasswordDto;
import com.password.model.Users;
import com.password.service.PasswordService;

@RestController
public class PasswordController {

	@Autowired
	private PasswordService crudService;

	// Insert User Data
	@PostMapping("/saveuser")
	public ResponseEntity<String> save(@RequestBody PasswordDto crudDto) {
		return crudService.saveUser(crudDto);
	}

	// Get all User Data
	@GetMapping("/users")
	public List<Users> allUsers() {
		return crudService.getData();
	}

	
}
