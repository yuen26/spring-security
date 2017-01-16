package com.yuen.repository;

import org.springframework.data.repository.CrudRepository;

import com.yuen.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
