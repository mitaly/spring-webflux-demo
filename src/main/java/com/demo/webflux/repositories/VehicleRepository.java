package com.demo.webflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.Vehicle;

@Repository
public interface VehicleRepository extends ReactiveMongoRepository<Vehicle, Integer> {

}
