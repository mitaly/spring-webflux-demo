package com.demo.webflux.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.demo.webflux.model.Address;

public interface AddressRepository extends ReactiveMongoRepository<Address, Integer> {

}
