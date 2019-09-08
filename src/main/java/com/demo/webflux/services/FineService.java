package com.demo.webflux.services;

import org.springframework.stereotype.Service;

import com.demo.webflux.model.Fine;
import com.demo.webflux.repositories.FineRepository;

import reactor.core.publisher.Mono;

@Service
public class FineService {
	private FineRepository repository;
	
	public FineService(FineRepository repository) {
		this.repository = repository;
	}
	
	public Mono<Fine> saveFine(Fine fine){
		return repository.save(fine);
	}
}
