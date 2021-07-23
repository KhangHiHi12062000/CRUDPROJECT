package com.example.DEMOPROJECT.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DEMOPROJECT.models.Users;
import com.example.DEMOPROJECT.repository.UserRepository;

@Service
public class UserServiceImplement implements UserServices{
	@Autowired
	UserRepository userRepository;
	@Override
	public Users save(Users entity) {
		return (Users)userRepository.save(entity);
	}

	@Override
	public 	List<Users> saveAll( List<Users> entity) {
		return (List<Users>)userRepository.saveAll(entity);
	}

	@Override
	public Optional<Users> findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return userRepository.existsById(id);
	}

	@Override
	public List<Users> findAll() {
		return (List<Users>)userRepository.findAll();
	}

	@Override
	public List<Users> findAllById(List<String> ids) {
		return (List<Users>)userRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return userRepository.count();
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}

	@Override
	public void delete(Users entity) {
		userRepository.delete(entity);
	}

	@Override
	public void deleteAllById(List<String> ids) {
		userRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<Users> entities) {
		userRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	public void setUserRepository(UserRepository userRepository) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserRepository getUserRepository() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
