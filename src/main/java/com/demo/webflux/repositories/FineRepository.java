package com.demo.webflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.Fine;

@Repository
public interface FineRepository extends ReactiveMongoRepository<Fine, Integer>{
	
}
