package com.educandoweb.course3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course3.entities.User;
import com.educandoweb.course3.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserRepository> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<UserRepository> obj = repository.findById(id);
		return (User) obj.get();
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}