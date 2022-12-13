package com.password.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.password.dto.PasswordDto;
import com.password.model.Users;

public interface PasswordService {

	ResponseEntity<String> saveUser(PasswordDto crudDto);

	List<Users> getData();


}
