package com.yuen.repository;

import org.springframework.data.repository.CrudRepository;

import com.yuen.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
	
}
