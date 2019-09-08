package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.model.Address;
import com.demo.webflux.model.User;
import com.demo.webflux.model.Vehicle;
import com.demo.webflux.repositories.UserRepository;
import com.demo.webflux.util.UserType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
	private UserRepository repository;
	
	public UserService(final UserRepository repository) {
		this.repository = repository;
	}
	
	public Mono<User> getUserByIdAndType(int userId, UserType userType) {
		return repository.findByUserIdAndUserType(userId, userType);
	}
	
	public Mono<Address> getAddressByAddressId(int addressId){
		return repository.getAddressByAddressId(addressId);
	}
	
	public Flux<Vehicle> getVehiclesByUserIdAndType(int userId, UserType userType){
		return repository.getVehiclesByUserId(userId, userType);
	}
	
	public Flux<User> getAllUsers(){
		return repository.findAll();
	}
	
	public Mono<User> saveUser(User user){
		return repository.save(user);
	}
}
