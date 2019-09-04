package com.demo.webflux.repositories;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.Address;
import com.demo.webflux.model.User;
import com.demo.webflux.model.Vehicle;
import com.demo.webflux.util.UserType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, Integer> {
	public Mono<User> findByUserIdAndUserType(int userId, UserType userType);
	
	@Query(value= "{address.addressId : ?0}")
	public Mono<Address> getAddressByAddressId(int addressId);

	@Query(value = "{userId : ?0, userType : ?1}")
	public Flux<Vehicle> getVehiclesByUserId(int userId, UserType userType);
}
