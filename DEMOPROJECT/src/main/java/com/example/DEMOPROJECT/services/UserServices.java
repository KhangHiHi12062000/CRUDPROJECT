package com.example.DEMOPROJECT.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.DEMOPROJECT.models.Users;
import com.example.DEMOPROJECT.repository.UserRepository;

public interface UserServices {

	void deleteAll();

	void deleteAll(List<Users> entities);

	void deleteAllById(List<String> ids);

	void delete(Users entity);

	void deleteById(String id);

	long count();

	List<Users> findAllById(List<String> ids);

	List<Users> findAll();

	boolean existsById(String id);

	Optional<Users> findById(String id);

	List<Users> saveAll(List<Users> entity);

	Users save(Users entity);

	void setUserRepository(UserRepository userRepository);

	UserRepository getUserRepository();

	

}
