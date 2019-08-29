package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.model.User;
import com.demo.webflux.repositories.UserRepository;
import com.demo.webflux.repositories.UserRepository;
import com.demo.webflux.util.UserType;

@Service
public class UserService {
	private UserRepository repository;
	
	public UserService(final UserRepository repository) {
		this.repository = repository;
	}
	
	public User getUser(int userId, UserType userType) {
		return repository.findByUserIdAndUserType(userId, userType);
	}
	
}
