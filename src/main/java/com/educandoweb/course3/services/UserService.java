package com.educandoweb.course3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.educandoweb.course3.entities.User;
import com.educandoweb.course3.repositories.UserRepository;
import com.educandoweb.course3.services.exceptions.DatabaseException;
import com.educandoweb.course3.services.exceptions.ResourseNotFoundException;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserRepository> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourseNotFoundException(id));
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		
		} catch (EmptyResultDataAccessException e){
			throw new ResourseNotFoundException(id);
		} catch (RuntimeException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	
}