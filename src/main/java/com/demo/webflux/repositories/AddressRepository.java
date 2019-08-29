package com.demo.webflux.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.webflux.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
