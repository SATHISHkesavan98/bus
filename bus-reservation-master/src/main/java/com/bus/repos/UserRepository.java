package com.bus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	
}
