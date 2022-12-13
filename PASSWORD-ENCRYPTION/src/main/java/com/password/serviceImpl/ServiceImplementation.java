package com.password.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.password.dao.PasswordRepository;
import com.password.dto.PasswordDto;
import com.password.model.Users;
import com.password.service.PasswordService;

@Service
public class ServiceImplementation implements PasswordService {

	@Autowired
	private PasswordRepository passwordRepository;
	
	
	@Override
	public ResponseEntity<String> saveUser(PasswordDto passwordDto) {

		Users users = new Users();
		users.setId(passwordDto.getId());
		users.setFname(passwordDto.getFname());
		users.setLname(passwordDto.getLname());
		users.setEmail(passwordDto.getEmail());
		users.setContact(passwordDto.getContact());
		users.setUsername(passwordDto.getUsername());
		
		PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		users.setPassword(passwordEncoder.encode(passwordDto.getPassword()));
		
		passwordRepository.save(users);
		return new ResponseEntity<>("User Registered Successfully...", HttpStatus.OK);
	}

	@Override
	public List<Users> getData() {
		List<Users> list = passwordRepository.findAll();
		return list;
	}

	

}
