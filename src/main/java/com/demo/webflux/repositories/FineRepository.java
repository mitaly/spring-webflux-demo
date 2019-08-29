package com.demo.webflux.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.Fine;

@Repository
public interface FineRepository extends JpaRepository<Fine, Integer>{
	
}
