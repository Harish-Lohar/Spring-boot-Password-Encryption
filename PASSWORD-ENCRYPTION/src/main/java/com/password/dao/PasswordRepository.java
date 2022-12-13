package com.password.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.password.model.Users;

public interface PasswordRepository extends JpaRepository<Users, Long> {

}
