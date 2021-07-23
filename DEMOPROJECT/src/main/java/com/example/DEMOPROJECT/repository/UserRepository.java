package com.example.DEMOPROJECT.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.DEMOPROJECT.models.Users;

public interface UserRepository extends CrudRepository<Users, String>{

	
}
