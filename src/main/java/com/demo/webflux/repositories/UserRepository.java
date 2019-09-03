package com.demo.webflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.User;
import com.demo.webflux.util.UserType;

import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, Integer> {
	public Mono<User> findByUserIdAndUserType(int userId, UserType userType);
}
