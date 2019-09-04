package com.demo.webflux.repositories;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.Fine;
import com.demo.webflux.model.Vehicle;

import reactor.core.publisher.Flux;

@Repository
public interface VehicleRepository extends ReactiveMongoRepository<Vehicle, Integer> {
	@Query(value="{vehicleId : ?0}")
	public Flux<Fine> getFinesByVehicleId(int vehicleId);
}
